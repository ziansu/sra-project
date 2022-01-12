public void setProxySettings(groovejames.service.ProxySettings proxySettings) {
    if (((proxySettings == null) && ((this.proxySettings) != null)) || ((proxySettings != null) && (!(proxySettings.equals(this.proxySettings))))) {
        shutdown();
        this.httpClient = groovejames.service.HttpClientService.createHttpClient(proxySettings);
        this.proxySettings = proxySettings;
    }
}