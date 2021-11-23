public static org.openqa.selenium.WebDriver getWebDriver() {
    com.example.tests.configuration.ConfigParams param = com.example.tests.configuration.ConfigParams.getInstance();
    if (null == (com.example.tests.tool.WebDriverUtils.driver)) {
        java.io.File pathBinary = new java.io.File(param.getValue(ConstantValue.KEY_FIREFOX_PATH));
        org.openqa.selenium.firefox.FirefoxBinary Binary = new org.openqa.selenium.firefox.FirefoxBinary(pathBinary);
        org.openqa.selenium.firefox.FirefoxProfile firefoxPro = new org.openqa.selenium.firefox.FirefoxProfile();
        com.example.tests.tool.WebDriverUtils.driver = new org.openqa.selenium.firefox.FirefoxDriver(Binary, firefoxPro);
        com.example.tests.tool.WebDriverUtils.driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
    }
    return com.example.tests.tool.WebDriverUtils.driver;
}