protected org.apache.ignite.configuration.CacheConfiguration cacheConfiguration(java.lang.String gridName, java.lang.String cacheName) {
    org.apache.ignite.configuration.CacheConfiguration cacheCfg = defaultCacheConfiguration();
    cacheCfg.setName(cacheName);
    cacheCfg.setCacheMode(org.apache.ignite.cache.CacheMode.PARTITIONED);
    cacheCfg.setBackups(1);
    cacheCfg.setAtomicityMode(org.apache.ignite.cache.CacheAtomicityMode.TRANSACTIONAL);
    return cacheCfg;
}