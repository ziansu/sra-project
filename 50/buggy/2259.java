public void dropAllCache() {
    if (null != (carbonLRUCache)) {
        carbonLRUCache.clear();
    }
    cacheTypeToCacheMap.clear();
}