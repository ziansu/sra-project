private void initLoaders() {
    loaders = new java.util.TreeSet<org.owasp.esapi.configuration.AbstractPrioritizedPropertyLoader>();
    try {
        loaders.add(org.owasp.esapi.configuration.EsapiPropertyLoaderFactory.createPropertyLoader(EsapiConfiguration.OPSTEAM_ESAPI_CFG));
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e.getMessage());
    }
    try {
        loaders.add(org.owasp.esapi.configuration.EsapiPropertyLoaderFactory.createPropertyLoader(EsapiConfiguration.DEVTEAM_ESAPI_CFG));
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e.getMessage());
    }
}