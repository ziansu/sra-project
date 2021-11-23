@java.lang.Override
public org.hibernate.cache.spi.CollectionRegion buildCollectionRegion(final java.lang.String regionName, final java.util.Properties properties, final org.hibernate.cache.spi.CacheDataDescription metadata) throws org.hibernate.cache.CacheException {
    final com.hazelcast.hibernate.region.HazelcastCollectionRegion<com.hazelcast.hibernate.local.LocalRegionCache> region = new com.hazelcast.hibernate.region.HazelcastCollectionRegion<com.hazelcast.hibernate.local.LocalRegionCache>(instance, regionName, properties, metadata, new com.hazelcast.hibernate.local.LocalRegionCache(regionName, instance, null));
    cleanupService.registerCache(region.getCache());
    return region;
}