public org.openqa.selenium.remote.DesiredCapabilities capabilitiesFirefox(org.openqa.selenium.remote.DesiredCapabilities capabilities) {
    capabilities = org.openqa.selenium.remote.DesiredCapabilities.firefox();
    org.openqa.selenium.firefox.FirefoxProfile profile = new org.openqa.selenium.firefox.FirefoxProfile();
    profile.setPreference("network.http.phishy-userpass-length", 255);
    profile.setEnableNativeEvents(true);
    profile.setAcceptUntrustedCertificates(true);
    capabilities.setCapability(FirefoxDriver.PROFILE, profile);
    capabilities.setBrowserName(org.openqa.selenium.remote.DesiredCapabilities.firefox().getBrowserName());
    return capabilities;
}