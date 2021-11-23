@java.lang.Override
public org.openqa.selenium.WebDriver getWebDriverInstance() {
    org.openqa.selenium.WebDriver retVal = getWebDriver();
    if (null == retVal) {
        org.bigtester.ate.model.page.atewebdriver.MyChromeDriver.setChromeDriverSystemEnv();
        if (getBrowserProfile().isPreserveCookiesOnExecutions()) {
            org.openqa.selenium.chrome.ChromeOptions ops = new org.openqa.selenium.chrome.ChromeOptions();
            ops.addArguments(("--user-data-dir=" + (getBrowserProfile().getTestCaseChromeUserDataDir())));
            retVal = new org.openqa.selenium.chrome.ChromeDriver(ops);
        }else {
            retVal = new org.openqa.selenium.chrome.ChromeDriver();
        }
    }
    setWebDriver(retVal);
    return retVal;
}