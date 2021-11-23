@org.auraframework.integration.test.components.ui.inputDate.ExcludeBrowsers(value = { org.auraframework.test.util.WebDriverUtil.BrowserType.ANDROID_PHONE , org.auraframework.test.util.WebDriverUtil.BrowserType.ANDROID_TABLET , org.auraframework.test.util.WebDriverUtil.BrowserType.IPAD , org.auraframework.test.util.WebDriverUtil.BrowserType.IPHONE })
@org.junit.Test
public void testEscape() throws java.lang.Exception {
    open(URL);
    openDatePicker();
    org.openqa.selenium.WebElement element = findDomElement(org.openqa.selenium.By.cssSelector(SELECTED_DATE));
    element.sendKeys(Keys.ESCAPE);
    assertFalse("Escape button did not close the calendar", isElementPresent(org.openqa.selenium.By.cssSelector("div[class*='uiDatePicker']")));
}