protected void assertNearCacheInvalidation_whenMaxSizeExceeded(com.hazelcast.config.NearCacheConfig config) {
    final com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> map = getNearCachedMapFromClient(config);
    populateNearCache(map, com.hazelcast.client.map.impl.nearcache.ClientMapNearCacheTest.MAX_CACHE_SIZE);
    triggerEviction(map);
    com.hazelcast.test.HazelcastTestSupport.assertTrueEventually(new com.hazelcast.test.AssertTask() {
        @java.lang.Override
        public void run() {
            assertThatOwnedEntryCountIsSmallerThan(map, com.hazelcast.client.map.impl.nearcache.ClientMapNearCacheTest.MAX_CACHE_SIZE);
        }
    });
}