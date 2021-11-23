@java.lang.Override
public void initialise(final java.util.Properties properties) {
    java.lang.String configFile = properties.getProperty(CacheProperties.CACHE_CONFIG_FILE);
    manager = org.apache.jcs.engine.control.CompositeCacheManager.getUnconfiguredInstance();
    if (configFile != null) {
        try {
            java.util.Properties cacheProperties = readProperties(configFile);
            manager.configure(cacheProperties);
            return ;
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException(("Cannot create uk.gov.gchq.gaffer.cache using config file " + configFile), e);
        }
    }
    uk.gov.gchq.gaffer.cache.impl.JcsCacheService.LOGGER.info("No config file configured. Using default.");
    manager.configure();
}