protected com.applitools.eyes.selenium.WebDriver open(com.applitools.eyes.selenium.WebDriver driver, java.lang.String appName, java.lang.String testName, com.applitools.eyes.selenium.RectangleSize viewportSize, com.applitools.eyes.selenium.SessionType sessionType) {
    if (getIsDisabled()) {
        logger.verbose("Ignored");
        return driver;
    }
    openBase(appName, testName, viewportSize, sessionType);
    com.applitools.eyes.selenium.ArgumentGuard.notNull(driver, "driver");
    devicePixelRatio = com.applitools.eyes.selenium.Eyes.UNKNOWN_DEVICE_PIXEL_RATIO;
    initDriver(driver);
    initPositionProvider();
    this.driver.setRotation(rotation);
    return this.driver;
}