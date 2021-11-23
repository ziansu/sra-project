public java.lang.String writeToCache(java.lang.Object object) {
    stateOfCache();
    if ((cacheStorage.size()) == (cacheSize)) {
    }
    com.epam.twolevelcache.CacheKey cacheKey = new com.epam.twolevelcache.CacheKey(java.lang.String.valueOf(object.hashCode()));
    cacheStorage.put(cacheKey, object);
    return cacheKey.getKey();
}