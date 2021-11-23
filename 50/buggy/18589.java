private void initializeSensitivePropertyProviderFactory() {
    if ((org.apache.nifi.properties.NiFiPropertiesLoader.sensitivePropertyProviderFactory) == null) {
        org.apache.nifi.properties.NiFiPropertiesLoader.sensitivePropertyProviderFactory = new org.apache.nifi.properties.AESSensitivePropertyProviderFactory(keyHex);
    }
}