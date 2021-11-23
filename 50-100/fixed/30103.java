public com.google.common.base.Optional<com.yammer.tenacity.core.config.TenacityConfiguration> getTenacityConfiguration(java.net.URI root, com.yammer.tenacity.core.properties.TenacityPropertyKey key) {
    try (com.codahale.metrics.Timer.Context timerContext = fetchConfiguration.time()) {
        return com.google.common.base.Optional.of(client.target(root).path(TenacityConfigurationResource.PATH).path(key.name()).request(MediaType.APPLICATION_JSON_TYPE).get(com.yammer.tenacity.core.config.TenacityConfiguration.class));
    } catch (java.lang.Exception err) {
        com.yammer.tenacity.client.TenacityClient.LOGGER.warn("Unable to retrieve tenacity configuration for {} and key {}", root, key.name(), err);
    }
    return com.google.common.base.Optional.absent();
}