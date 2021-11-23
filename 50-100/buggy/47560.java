public static void setIOSAppiumCapabilities(org.openqa.selenium.remote.DesiredCapabilities capabilities, java.lang.String app, java.lang.String deviceName, java.lang.String platformVersion) {
    capabilities.setCapability("browserName", app);
    capabilities.setCapability("platformVersion", platformVersion);
    capabilities.setCapability("appiumVersion", org.auraframework.test.util.SauceUtil.APPIUM_VERSION);
    capabilities.setCapability("platformName", "iOS");
    capabilities.setCapability("deviceName", deviceName);
    capabilities.setCapability("orientation", "portrait");
    return ;
}