private java.util.Map<java.lang.String, org.cloudfoundry.identity.uaa.provider.saml.idp.SamlServiceProviderHolder> getOrCreateSamlServiceProviderMapForZone(org.cloudfoundry.identity.uaa.zone.IdentityZone zone) {
    java.util.Map<java.lang.String, org.cloudfoundry.identity.uaa.provider.saml.idp.SamlServiceProviderHolder> serviceProviders = zoneServiceProviders.get(zone);
    if (serviceProviders == null) {
        synchronized(zoneServiceProviders) {
            serviceProviders = zoneServiceProviders.get(zone);
            if (serviceProviders == null) {
                serviceProviders = new java.util.HashMap<>();
                zoneServiceProviders.put(zone, serviceProviders);
            }
        }
    }
    return serviceProviders;
}