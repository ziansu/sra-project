public static org.openqa.selenium.WebDriver getDriver() {
    org.openqa.selenium.WebDriver driver = ((net.thucydides.core.webdriver.ThucydidesWebDriverSupport.currentRequestedDriver.get()) != null) ? net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager().getWebdriver(net.thucydides.core.webdriver.ThucydidesWebDriverSupport.currentRequestedDriver.get()) : net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager().getWebdriver();
    net.thucydides.core.webdriver.ThucydidesWebDriverSupport.registeredWebdrivers.add(driver);
    return driver;
}