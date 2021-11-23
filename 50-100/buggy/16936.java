org.apache.karaf.features.internal.resolver.ResourceImpl createResource(java.lang.String uri, java.util.Map<java.lang.String, java.lang.String> headers, java.lang.String serviceRequirements) throws java.lang.Exception {
    boolean removeServiceRequirements = false;
    if ((((feature) != null) && (FeaturesService.SERVICE_REQUIREMENTS_DEFAULT.equals(serviceRequirements))) && (!(FeaturesNamespaces.URI_1_3_0.equals(uri)))) {
        removeServiceRequirements = true;
    }
    try {
        return org.apache.karaf.features.internal.resolver.ResourceBuilder.build(uri, headers, removeServiceRequirements);
    } catch (org.osgi.framework.BundleException e) {
        throw new java.lang.Exception(("Unable to create resource for bundle " + uri), e);
    }
}