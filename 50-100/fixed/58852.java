public void type(java.lang.String xpath, java.lang.String text) {
    waitElement(xpath, timeout);
    org.openqa.selenium.WebElement element = getElement(xpath);
    try {
        element.clear();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    try {
        element.sendKeys(text);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}