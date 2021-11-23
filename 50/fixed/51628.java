public void clickText(java.lang.String text) {
    org.openqa.selenium.WebElement element = browser.findElement(org.openqa.selenium.By.partialLinkText(text));
    try {
        element.click();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}