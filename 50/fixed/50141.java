protected <K, V> com.hazelcast.core.IMap<K, V> getNearCachedMapFromClient(com.hazelcast.config.NearCacheConfig nearCacheConfig) {
    return getNearCachedMapFromClient(newConfig(), nearCacheConfig);
}