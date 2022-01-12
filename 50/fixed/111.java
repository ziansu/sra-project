@java.lang.Override
public org.openqa.selenium.WebDriver getWebDriverInstance() {
    org.openqa.selenium.WebDriver retVal = getWebDriver();
    if (null == retVal) {
        retVal = new org.openqa.selenium.htmlunit.HtmlUnitDriver(true);
        setWebDriver(retVal);
    }
    return retVal;
}