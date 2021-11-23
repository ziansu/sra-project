@org.testng.annotations.Test(groups = { "browser-tests" }, expectedExceptions = { org.openqa.selenium.TimeoutException.class })
@com.paypal.selion.annotations.WebTest
public void testWaitUntilElementPresentNeg() {
    com.paypal.selion.platform.grid.Grid.driver().get(url);
    java.lang.String origTimeout = com.paypal.selion.configuration.Config.getConfigProperty(Config.ConfigProperty.EXECUTION_TIMEOUT);
    try {
        com.paypal.selion.configuration.Config.setConfigProperty(Config.ConfigProperty.EXECUTION_TIMEOUT, "20000");
        com.paypal.selion.platform.utilities.WebDriverWaitUtils.waitUntilElementIsPresent(badLocator);
    } finally {
        com.paypal.selion.configuration.Config.setConfigProperty(Config.ConfigProperty.EXECUTION_TIMEOUT, origTimeout);
    }
    org.testng.Assert.fail("Timeout Exception was not thrown.");
}