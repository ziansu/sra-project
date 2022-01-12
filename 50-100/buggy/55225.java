private io.jboot.core.cache.JbootCache buildCache() {
    io.jboot.core.cache.JbootCacheConfig config = io.jboot.Jboot.config(io.jboot.core.cache.JbootCacheConfig.class);
    switch (config.getType()) {
        case JbootCacheConfig.TYPE_EHCACHE :
            return new io.jboot.core.cache.ehcache.JbootEhcacheImpl();
        case JbootCacheConfig.TYPE_REDIS :
            return new io.jboot.core.cache.redis.JbootRedisCacheImpl();
        case JbootCacheConfig.TYPE_EHREDIS :
            return new io.jboot.core.cache.ehredis.JbootEhredisCacheImpl();
        case JbootCacheConfig.TYPE_NONE_CACHE :
            jbootCache = new io.jboot.core.cache.NoneCacheImpl();
        default :
            return io.jboot.core.spi.JbootSpiManager.me().spi(io.jboot.core.cache.JbootCache.class, config.getType());
    }
}