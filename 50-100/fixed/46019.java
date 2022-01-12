public io.sealights.plugins.sealightsjenkins.integration.upgrade.entities.UpgradeResponse getRecommendedVersion(java.lang.String componentName) throws java.io.IOException {
    java.lang.String serverUrl = createUrlToGetRecommendedVersion(componentName);
    logger.info((("Trying to get recommended version. Url: '" + serverUrl) + "'"));
    io.sealights.plugins.sealightsjenkins.services.ApacheHttpClient client = new io.sealights.plugins.sealightsjenkins.services.ApacheHttpClient();
    io.sealights.plugins.sealightsjenkins.services.HttpResponse httpResponse = client.getJson(serverUrl, upgradeConfiguration.getProxy(), upgradeConfiguration.getToken(), true);
    java.lang.String jsonOrServerError = io.sealights.plugins.sealightsjenkins.utils.StreamUtils.toString(httpResponse.getResponseStream());
    io.sealights.plugins.sealightsjenkins.integration.upgrade.entities.UpgradeResponse upgradeResponse = io.sealights.plugins.sealightsjenkins.utils.JsonSerializer.deserialize(jsonOrServerError, io.sealights.plugins.sealightsjenkins.integration.upgrade.entities.UpgradeResponse.class);
    return upgradeResponse;
}