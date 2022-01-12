private com.google.api.services.discovery.model.RestDescription getDiscovery(com.google.api.server.spi.discovery.DiscoveryGenerator.DiscoveryContext context, java.lang.Class<?> serviceClass) throws java.lang.Exception {
    com.google.common.collect.ImmutableList.Builder<com.google.api.server.spi.config.model.ApiConfig> builder = com.google.common.collect.ImmutableList.builder();
    com.google.api.server.spi.config.model.ApiConfig config = configLoader.loadConfiguration(com.google.api.server.spi.ServiceContext.create(), serviceClass);
    return com.google.common.collect.Iterables.getFirst(generator.writeDiscovery(com.google.common.collect.ImmutableList.of(config), context, schemaRepository).discoveryDocs().values(), null).clone();
}