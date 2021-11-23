@org.junit.Test
public void shouldNotFlushCacheWhenBaseUrlConfigIsNotChanged() {
    com.thoughtworks.go.server.cache.GoCache cache = mock(com.thoughtworks.go.server.cache.GoCache.class);
    com.thoughtworks.go.listener.BaseUrlChangeListener listener = new com.thoughtworks.go.listener.BaseUrlChangeListener(new com.thoughtworks.go.domain.ServerSiteUrlConfig(""), new com.thoughtworks.go.domain.ServerSiteUrlConfig(""), cache);
    com.thoughtworks.go.config.CruiseConfig newCruiseConfig = new com.thoughtworks.go.config.BasicCruiseConfig();
    newCruiseConfig.setServerConfig(serverConfigWith("", ""));
    listener.onConfigChange(newCruiseConfig);
    verifyZeroInteractions(cache);
}