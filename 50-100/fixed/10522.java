protected org.apache.ignite.configuration.CacheConfiguration cacheConfiguration(@org.jetbrains.annotations.NotNull
java.lang.String name) {
    org.apache.ignite.configuration.CacheConfiguration<?, ?> cache = defaultCacheConfiguration();
    cache.setName(name);
    cache.setCacheMode(org.apache.ignite.cache.CacheMode.PARTITIONED);
    cache.setBackups(1);
    cache.setWriteSynchronizationMode(org.apache.ignite.cache.CacheWriteSynchronizationMode.FULL_SYNC);
    cache.setAtomicityMode(org.apache.ignite.cache.CacheAtomicityMode.TRANSACTIONAL);
    return cache;
}