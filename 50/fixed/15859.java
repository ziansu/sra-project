public boolean isElementPresent(java.lang.String locatorWithText) {
    try {
        return webDriver.findElement(org.openqa.selenium.By.xpath(locatorWithText)).isDisplayed();
    } catch (java.lang.Exception e) {
        return false;
    }
}