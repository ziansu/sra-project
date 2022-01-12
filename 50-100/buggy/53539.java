private <K, V> com.hazelcast.core.IMap<K, V> getNearCachedMapFromClient(com.hazelcast.config.Config config, com.hazelcast.config.NearCacheConfig nearCacheConfig) {
    java.lang.String mapName = com.hazelcast.test.HazelcastTestSupport.randomMapName();
    hazelcastFactory.newHazelcastInstance(config);
    nearCacheConfig.setName((mapName + "*"));
    com.hazelcast.client.config.ClientConfig clientConfig = newClientConfig();
    clientConfig.addNearCacheConfig(nearCacheConfig);
    com.hazelcast.core.HazelcastInstance client = hazelcastFactory.newHazelcastClient(clientConfig);
    return client.getMap(mapName);
}