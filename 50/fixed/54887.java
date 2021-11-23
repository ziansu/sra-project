protected com.hazelcast.config.Config newConfig() {
    com.hazelcast.config.Config config = new com.hazelcast.config.Config();
    config.setProperty(com.hazelcast.spi.properties.GroupProperty.MAP_INVALIDATION_MESSAGE_BATCH_ENABLED.getName(), java.lang.String.valueOf(batchInvalidationEnabled));
    return config;
}