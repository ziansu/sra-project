protected org.apache.ignite.configuration.CacheConfiguration cacheConfiguration(java.lang.String gridName, java.lang.String cacheName) {
    org.apache.ignite.configuration.CacheConfiguration cacheCfg = defaultCacheConfiguration();
    cacheCfg.setName(cacheName);
    cacheCfg.setCacheMode(org.apache.ignite.cache.CacheMode.PARTITIONED);
    cacheCfg.setWriteSynchronizationMode(CacheWriteSynchronizationMode.FULL_SYNC);
    cacheCfg.setAffinityMapper(new org.apache.ignite.igfs.IgfsGroupDataBlocksKeyMapper(org.apache.ignite.internal.processors.hadoop.impl.igfs.IgniteHadoopFileSystemWithIgniteClientSelfTest.GRP_SIZE));
    cacheCfg.setBackups(1);
    cacheCfg.setAtomicityMode(org.apache.ignite.cache.CacheAtomicityMode.TRANSACTIONAL);
    return cacheCfg;
}