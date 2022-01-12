protected org.openqa.selenium.remote.DesiredCapabilities getCapsWithProxyServerSet(net.lightbody.bmp.proxy.ProxyServer server) {
    capabilities = new org.openqa.selenium.remote.DesiredCapabilities();
    capabilities.setCapability(CapabilityType.PROXY, server.seleniumProxy());
    return capabilities;
}