public void rightClick(java.lang.String xpath) {
    waitElement(xpath, timeout);
    org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(browser);
    org.openqa.selenium.WebElement we = getElement(xpath);
    action.contextClick(we).perform();
}