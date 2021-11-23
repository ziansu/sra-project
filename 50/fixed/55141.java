@java.lang.Override
protected void createCacheManagers() throws java.lang.Throwable {
    org.infinispan.configuration.cache.ConfigurationBuilder builder = org.infinispan.test.AbstractCacheTest.getDefaultClusteredCacheConfig(CacheMode.DIST_SYNC, false);
    createClusteredCaches(org.infinispan.atomic.AtomicObjectFactoryTest.NCACHES, builder);
}