public static org.openqa.selenium.WebDriver getDriver() {
    if ((net.thucydides.core.webdriver.ThucydidesWebDriverSupport.currentRequestedDriver.get()) != null) {
        return net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager().getWebdriver(net.thucydides.core.webdriver.ThucydidesWebDriverSupport.currentRequestedDriver.get());
    }else {
        return net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager().getWebdriver();
    }
}