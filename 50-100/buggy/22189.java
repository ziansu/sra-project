public void moveToElementAndClick(com.llbean.automation.web.pages.WebElement element) {
    org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
    this.waitToBeClickable(element);
    this.waitForJavaScriptToComplete();
    this.waitForJQueryToComplete();
    action.moveToElement(element).click().perform();
}