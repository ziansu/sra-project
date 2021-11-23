public void type(java.lang.String xpath, java.lang.String text) {
    waitElement(xpath, timeout);
    org.openqa.selenium.WebElement we = getElement(xpath);
    we.sendKeys(text);
    try {
        we.clear();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    try {
        we.sendKeys(text);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}