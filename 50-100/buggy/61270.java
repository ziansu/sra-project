protected void click(org.openqa.selenium.WebElement element) {
    try {
        element.click();
    } catch (org.openqa.selenium.NoSuchElementException e) {
        waitForElement(element);
        try {
            element.click();
        } catch (java.lang.Exception e2) {
            errorHeppens(e.getMessage());
        }
    }
}