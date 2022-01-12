private void loadConfigs(java.util.List<java.io.File> configFiles) {
    registerDataStores(configFiles);
    registerForms(configFiles);
    if ((com.boundlessgeo.spatialconnect.services.SCConfigService.API_URL) == null) {
        java.lang.String remoteUrl = getRemoteConfigUrl(configFiles);
        if (remoteUrl != null) {
            com.boundlessgeo.spatialconnect.services.SCConfigService.API_URL = (remoteUrl.endsWith("/")) ? remoteUrl + "api/" : remoteUrl + "/api/";
        }
    }
}