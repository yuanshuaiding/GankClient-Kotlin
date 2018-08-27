package com.wingsofts.gankclient.bean

import java.util.*

/**
 * Created by wing on 11/23/16.
 */
 data class FuckGoods(
    val _id: String,
    val createdAt: String,
    val desc: String,
    val images: Array<String>?,
    val publishedAt: String,
    val source: String,
    val type: String,
    val url: String,
    val used: Boolean,
    val who: String

){
    fun hasImg():Boolean {
        return images != null
    }
    fun create() = createdAt.substring(0,10)
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FuckGoods

        if (_id != other._id) return false
        if (createdAt != other.createdAt) return false
        if (desc != other.desc) return false
        if (!Arrays.equals(images, other.images)) return false
        if (publishedAt != other.publishedAt) return false
        if (source != other.source) return false
        if (type != other.type) return false
        if (url != other.url) return false
        if (used != other.used) return false
        if (who != other.who) return false

        return true
    }

    override fun hashCode(): Int {
        var result = _id.hashCode()
        result = 31 * result + createdAt.hashCode()
        result = 31 * result + desc.hashCode()
        result = 31 * result + (images?.let { Arrays.hashCode(it) } ?: 0)
        result = 31 * result + publishedAt.hashCode()
        result = 31 * result + source.hashCode()
        result = 31 * result + type.hashCode()
        result = 31 * result + url.hashCode()
        result = 31 * result + used.hashCode()
        result = 31 * result + who.hashCode()
        return result
    }

}