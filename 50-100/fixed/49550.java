public void onConfigChange(com.thoughtworks.go.config.CruiseConfig newCruiseConfig) {
    com.thoughtworks.go.config.ServerConfig newServerConfig = newCruiseConfig.server();
    com.thoughtworks.go.domain.ServerSiteUrlConfig newSecureSiteUrl = newServerConfig.getSecureSiteUrl();
    com.thoughtworks.go.domain.ServerSiteUrlConfig newSiteUrl = newServerConfig.getSiteUrl();
    if (!((secureSiteUrl.equals(newSecureSiteUrl)) && (siteUrl.equals(newSiteUrl)))) {
        goCache.remove(com.thoughtworks.go.listener.BaseUrlChangeListener.URLS_CACHE_KEY);
        com.thoughtworks.go.listener.BaseUrlChangeListener.LOGGER.info(java.lang.String.format(("[Configuration Changed] Site URL was changed from [%s] to [%s] and " + "Secure Site URL was changed from [%s] to [%s]"), siteUrl, newSiteUrl, secureSiteUrl, newSecureSiteUrl));
    }
    setUrls(newSiteUrl, newSecureSiteUrl);
}