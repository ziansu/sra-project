private void initializeSensitivePropertyProviderFactory() {
    org.apache.nifi.properties.NiFiPropertiesLoader.sensitivePropertyProviderFactory = new org.apache.nifi.properties.AESSensitivePropertyProviderFactory(keyHex);
}