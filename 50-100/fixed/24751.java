protected void initializeConnectionProviders() throws org.n52.iceland.exception.ConfigurationException {
    checkForProvidedJdbc();
    dataConnectionProvider.initialize(dataConnectionProviderProperties);
    if ((featureConnectionProvider) != null) {
        featureConnectionProvider.initialize(((featureConnectionProviderProperties) != null ? featureConnectionProviderProperties : dataConnectionProviderProperties));
    }else {
        featureConnectionProvider = dataConnectionProvider;
    }
}