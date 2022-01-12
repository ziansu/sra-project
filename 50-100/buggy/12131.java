private org.openqa.selenium.remote.DesiredCapabilities setCapabilities() {
    org.openqa.selenium.remote.DesiredCapabilities caps = new org.openqa.selenium.remote.DesiredCapabilities();
    caps.setCapability(CapabilityType.BROWSER_NAME, org.fundacionjala.sfdc.core.driver.SauceLabs.ENV.getRemoteBrowser());
    caps.setCapability(CapabilityType.VERSION, org.fundacionjala.sfdc.core.driver.SauceLabs.ENV.getRemoteBrowserVersion());
    caps.setCapability(org.fundacionjala.sfdc.core.driver.SauceLabs.PLATFORM, java.lang.String.format("%s %s", org.fundacionjala.sfdc.core.driver.SauceLabs.ENV.getRemotePlatform(), org.fundacionjala.sfdc.core.driver.SauceLabs.ENV.getRemotePlatformVersion()));
    caps.setCapability(org.fundacionjala.sfdc.core.driver.SauceLabs.RESOLUTION, org.fundacionjala.sfdc.core.driver.SauceLabs.ENV.getRemoteResolution());
    return caps;
}