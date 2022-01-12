private <K, V> com.hazelcast.config.CacheConfig<K, V> createCacheConfig() {
    return new com.hazelcast.config.CacheConfig<K, V>().setInMemoryFormat(InMemoryFormat.BINARY);
}