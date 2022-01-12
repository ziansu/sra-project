private org.openqa.selenium.remote.DesiredCapabilities setCapabilities() {
    org.openqa.selenium.remote.DesiredCapabilities caps = new org.openqa.selenium.remote.DesiredCapabilities();
    caps.setCapability(org.fundacionjala.sfdc.core.driver.BrowserStack.BROWSER, org.fundacionjala.sfdc.core.driver.BrowserStack.ENV.getRemoteBrowser());
    caps.setCapability(org.fundacionjala.sfdc.core.driver.BrowserStack.VERSION, org.fundacionjala.sfdc.core.driver.BrowserStack.ENV.getRemoteBrowserVersion());
    caps.setCapability(org.fundacionjala.sfdc.core.driver.BrowserStack.OS, org.fundacionjala.sfdc.core.driver.BrowserStack.ENV.getRemotePlatform());
    caps.setCapability(org.fundacionjala.sfdc.core.driver.BrowserStack.OS_VERSION, org.fundacionjala.sfdc.core.driver.BrowserStack.ENV.getRemotePlatformVersion());
    caps.setCapability(org.fundacionjala.sfdc.core.driver.BrowserStack.RESOLUTION, org.fundacionjala.sfdc.core.driver.BrowserStack.ENV.getRemoteResolution());
    return caps;
}