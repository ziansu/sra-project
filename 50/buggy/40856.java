public void loadConfigFromCache() {
    com.boundlessgeo.spatialconnect.config.SCConfig config = getCachedConfig();
    loadConfig(config);
}