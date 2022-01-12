private com.hazelcast.cache.impl.HazelcastServerCachingProvider createCachingProvider(com.hazelcast.config.Config hzConfig) {
    com.hazelcast.core.HazelcastInstance hazelcastInstance = com.hazelcast.core.Hazelcast.newHazelcastInstance(hzConfig);
    return com.hazelcast.cache.impl.HazelcastServerCachingProvider.createCachingProvider(hazelcastInstance);
}