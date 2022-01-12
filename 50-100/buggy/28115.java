private void updateCache(java.lang.String id, java.lang.Object value) {
    if ((cache.size()) > (max_cache_size)) {
        cache.clear();
    }
    cache.putIfAbsent(cache_key(id, value.getClass()), value);
}