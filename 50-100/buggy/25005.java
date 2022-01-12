@java.lang.Override
public java.util.List<java.net.URI> getBackendURIs() {
    java.util.List<java.net.URI> result = new java.util.ArrayList<>(getBackendURIs().size());
    for (org.apache.tamaya.mutableconfig.spi.MutableConfigurationBackendSpi backend : targets) {
        result.add(backend.getBackendURI());
    }
    return java.util.Collections.unmodifiableList(result);
}