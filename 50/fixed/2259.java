public void dropAllCache() {
    if (null != (carbonLRUCache)) {
        carbonLRUCache.clear();
        carbonLRUCache = null;
    }
    cacheTypeToCacheMap.clear();
}