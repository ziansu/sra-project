protected void initializeConnectionProviders() throws org.n52.iceland.exception.ConfigurationException {
    checkForProvidedJdbc();
    dataConnectionProvider = org.n52.iceland.component.ConfiguringSingletonServiceLoader.<org.n52.iceland.ds.ConnectionProvider>loadAndConfigure(org.n52.iceland.ds.DataConnectionProvider.class, true, getConnectionProviderIdentificator());
    featureConnectionProvider = org.n52.iceland.component.ConfiguringSingletonServiceLoader.<org.n52.iceland.ds.ConnectionProvider>loadAndConfigure(org.n52.iceland.ds.IFeatureConnectionProvider.class, false, getConnectionProviderIdentificator());
    dataConnectionProvider.initialize(dataConnectionProviderProperties);
    if ((featureConnectionProvider) != null) {
        featureConnectionProvider.initialize(((featureConnectionProviderProperties) != null ? featureConnectionProviderProperties : dataConnectionProviderProperties));
    }else {
        featureConnectionProvider = dataConnectionProvider;
    }
}