public java.lang.String get(java.lang.String key) {
    hello.lru.LRUCache.CacheNode result = cache.get(key);
    if (result == null) {
        return null;
    }
    moveNodeToHead(result);
    return result.value;
}