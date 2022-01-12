public org.openqa.selenium.remote.SessionId getSessionId() {
    org.openqa.selenium.WebDriver driver = net.thucydides.core.webdriver.ThucydidesWebdriverManager.getThreadLocalWebDriver(configuration, webDriverFactory, net.thucydides.core.webdriver.ThucydidesWebdriverManager.inThisTestThread().getCurrentDriverName());
    if (driver instanceof org.openqa.selenium.remote.RemoteWebDriver) {
        return ((org.openqa.selenium.remote.RemoteWebDriver) (driver)).getSessionId();
    }
    throw new java.lang.IllegalArgumentException("Session Ids are only available for remote web drivers");
}