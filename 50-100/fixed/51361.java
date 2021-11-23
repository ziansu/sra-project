private java.util.List<com.emc.storageos.api.service.impl.resource.AuthnProvider> getProvidersFromDb() {
    java.util.List<com.emc.storageos.api.service.impl.resource.AuthnProvider> providers = new java.util.ArrayList<>();
    java.util.List<java.net.URI> ids = _dbClient.queryByType(com.emc.storageos.api.service.impl.resource.AuthnProvider.class, true);
    for (java.net.URI id : ids) {
        providers.add(((com.emc.storageos.api.service.impl.resource.AuthnProvider) (_dbClient.queryObject(id))));
    }
    return providers;
}