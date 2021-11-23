public com.boundlessgeo.spatialconnect.config.SCConfig getCachedConfig() {
    com.boundlessgeo.spatialconnect.config.SCConfig returnConfig = null;
    try {
        com.boundlessgeo.spatialconnect.SpatialConnect sc = com.boundlessgeo.spatialconnect.SpatialConnect.getInstance();
        java.lang.String configJson = sc.getCache().getStringValue("spatialconnect.config.remote.cached");
        if (configJson != null) {
            returnConfig = com.boundlessgeo.spatialconnect.scutilities.Json.ObjectMappers.getMapper().readValue(configJson, com.boundlessgeo.spatialconnect.config.SCConfig.class);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return returnConfig;
}