public static void waitElementPresenceByAttribute(org.openqa.selenium.WebDriver driver, int waitTime, java.lang.String xpath, java.lang.String attrubite, java.lang.String value) {
    org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, waitTime);
    java.lang.System.out.println(driver.findElement(org.openqa.selenium.By.xpath(xpath)).getAttribute(attrubite));
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.attributeContains(driver.findElement(org.openqa.selenium.By.xpath(xpath)), attrubite, value));
    java.lang.System.out.println(driver.findElement(org.openqa.selenium.By.xpath(xpath)).getAttribute(attrubite));
}