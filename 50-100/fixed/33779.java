protected com.hazelcast.client.config.ClientConfig newClientConfig(java.lang.String mapName) {
    com.hazelcast.config.NearCacheConfig nearCacheConfig = new com.hazelcast.config.NearCacheConfig();
    nearCacheConfig.setInMemoryFormat(getNearCacheInMemoryFormat());
    nearCacheConfig.setName(mapName);
    nearCacheConfig.setInvalidateOnChange(true);
    nearCacheConfig.setCacheLocalEntries(true);
    com.hazelcast.client.config.ClientConfig clientConfig = new com.hazelcast.client.config.ClientConfig();
    clientConfig.addNearCacheConfig(nearCacheConfig);
    return clientConfig;
}