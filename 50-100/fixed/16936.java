org.apache.karaf.features.internal.resolver.ResourceImpl createResource(java.lang.String uri, java.util.Map<java.lang.String, java.lang.String> headers, boolean removeServiceRequirements) throws java.lang.Exception {
    try {
        return org.apache.karaf.features.internal.resolver.ResourceBuilder.build(uri, headers, removeServiceRequirements);
    } catch (org.osgi.framework.BundleException e) {
        throw new java.lang.Exception(("Unable to create resource for bundle " + uri), e);
    }
}