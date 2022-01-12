@org.testng.annotations.BeforeTest
private void initDriver() {
    java.lang.System.setProperty("webdriver.gecko.driver", com.epam.latysheva.SimpleTest.PATH_TO_GEKODRIVER);
    driver = new org.openqa.selenium.firefox.FirefoxDriver();
    driver.manage().timeouts().pageLoadTimeout(15, java.util.concurrent.TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, java.util.concurrent.TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
}