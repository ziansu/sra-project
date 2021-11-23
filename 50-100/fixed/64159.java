@java.lang.Override
protected void doTrack(java.lang.String name, java.util.Map<java.lang.String, java.lang.Object> allProps) {
    hudson.ProxyConfiguration proxyConfig = jenkins.model.Jenkins.getInstance().proxy;
    java.net.Proxy proxy = (proxyConfig == null) ? null : proxyConfig.createProxy(null);
    io.jenkins.blueocean.service.embedded.analytics.KeenAnalyticsImpl.CLIENT.setProxy(proxy);
    io.jenkins.blueocean.service.embedded.analytics.KeenAnalyticsImpl.CLIENT.addEventAsync(name, allProps);
}