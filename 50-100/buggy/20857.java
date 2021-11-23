protected <K, V> com.hazelcast.config.CacheConfig<K, V> getCacheConfigWithMaxSize(int maxCacheSize) {
    com.hazelcast.config.CacheConfig<K, V> config = createCacheConfig();
    config.getEvictionConfig().setEvictionPolicy(EvictionPolicy.RANDOM);
    config.getEvictionConfig().setMaximumSizePolicy(EvictionConfig.MaxSizePolicy.ENTRY_COUNT);
    config.getEvictionConfig().setSize(maxCacheSize);
    return config;
}