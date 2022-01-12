public org.openqa.selenium.remote.SessionId getSessionId() {
    org.openqa.selenium.WebDriver driver = net.thucydides.core.webdriver.ThucydidesWebdriverManager.getThreadLocalWebDriver(configuration, webDriverFactory, net.thucydides.core.webdriver.ThucydidesWebdriverManager.inThisTestThread().getCurrentDriverName());
    if (driver instanceof org.openqa.selenium.remote.RemoteWebDriver) {
        return ((org.openqa.selenium.remote.RemoteWebDriver) (driver)).getSessionId();
    }
    return null;
}