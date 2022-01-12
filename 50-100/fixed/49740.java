public com.emc.storageos.db.client.model.AuthnProvider getOidcAuthProvider() {
    for (com.emc.storageos.auth.impl.AuthenticationProvider provider : authProviders.getAuthenticationProviders()) {
        if ((provider.getProviderConfig()) == null) {
            continue;
        }
        if (provider.getProviderConfig().getMode().equalsIgnoreCase(AuthnProvider.ProvidersType.oidc.name())) {
            return provider.getProviderConfig();
        }
    }
    throw new java.lang.RuntimeException("No OIDC provider is found");
}