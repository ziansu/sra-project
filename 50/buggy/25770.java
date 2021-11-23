private <K, V> com.hazelcast.config.CacheConfig<K, V> createCacheConfig() {
    com.hazelcast.config.CacheConfig<K, V> cacheConfig = new com.hazelcast.config.CacheConfig<K, V>();
    cacheConfig.setInMemoryFormat(InMemoryFormat.BINARY);
    return cacheConfig;
}