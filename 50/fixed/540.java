public javax.cache.spi.CachingProvider getCachingProvider() {
    bootstrapHazelcast();
    return hazelcastCachingProvider;
}