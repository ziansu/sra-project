public static void waitElementPresenceByAttribute(org.openqa.selenium.WebDriver driver, int waitTime, java.lang.String xpath, java.lang.String attrubite, java.lang.String value) {
    org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, waitTime);
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.attributeContains(driver.findElement(org.openqa.selenium.By.xpath(xpath)), attrubite, value));
}