public void enterFrame(java.lang.String xpath) {
    waitElement(xpath, timeout);
    org.openqa.selenium.WebElement element = getElement(xpath);
    browser.switchTo().frame(element);
}