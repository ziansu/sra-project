@WebTests.BeforeTest(groups = "InternetExplorer")
public void setUpDriverIE(java.lang.String baseUrl) throws java.lang.InterruptedException {
    logger.info("[TEST STARTED]");
    logger.info(("OS: " + (operationSystem)));
    java.lang.System.setProperty("webdriver.ie.driver", java.lang.String.valueOf(driverIEWin));
    driver = new org.openqa.selenium.ie.InternetExplorerDriver();
    driver.navigate().to(Data.ConfigProperties.getProperty("baseUrl"));
}