protected org.openqa.selenium.remote.DesiredCapabilities getCapsWithProxyServerSet(net.lightbody.bmp.proxy.ProxyServer server) {
    capabilities = new org.openqa.selenium.remote.DesiredCapabilities();
    try {
        capabilities.setCapability(CapabilityType.PROXY, server.seleniumProxy());
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
    return capabilities;
}