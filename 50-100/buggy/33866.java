@java.lang.Override
protected <K, V> com.hazelcast.config.CacheConfig<K, V> findConfig(java.lang.String cacheName, java.lang.String simpleCacheName, boolean createAlsoOnOthers, boolean syncCreate) {
    com.hazelcast.config.CacheConfig<K, V> config = configs.get(cacheName);
    if (config == null) {
        if (config == null) {
            config = getCacheConfigFromPartition(cacheName, simpleCacheName);
        }
        if (config != null) {
            createConfig(cacheName, config, createAlsoOnOthers, syncCreate);
        }
    }
    return config;
}