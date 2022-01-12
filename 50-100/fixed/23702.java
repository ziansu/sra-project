@org.testng.annotations.BeforeMethod(alwaysRun = true)
public void InitializeWebDriver() {
    java.lang.System.out.println("Open Driver for Firefox.");
    java.lang.System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
    org.openqa.selenium.remote.DesiredCapabilities capabilities = org.openqa.selenium.remote.DesiredCapabilities.firefox();
    capabilities.setCapability("marionette", true);
    driver = new org.openqa.selenium.firefox.FirefoxDriver(capabilities);
    wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 10, 1);
    shortWait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 4, 1);
}