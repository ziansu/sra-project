protected void createCache(java.lang.String namespace) {
    try {
        this.cacheImpl = iddb.core.cache.CacheFactory.getInstance().getCache("alias");
    } catch (iddb.core.cache.UnavailableCacheException e) {
        this.cacheImpl = null;
    }
}