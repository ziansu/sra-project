public static java.util.List<java.lang.Integer> zrevrange(java.lang.String key, int start, int end, redis.clients.jedis.JedisPool jedisPool) {
    java.util.Set<java.lang.String> ids = com.dreambox.core.utils.RedisCacheUtils.zrevrangeIdStringSet(key, start, end, jedisPool);
    try {
        return com.dreambox.web.utils.CollectionUtils.setStringToListInt(ids);
    } catch (java.lang.Exception e) {
        throw com.dreambox.web.exception.ServiceException.getCacheDataException("缓存服务器数据错误，请稍后再试.");
    }
}