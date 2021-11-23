private boolean isElementPresent(com.lazerycode.selenium.tests.By by) {
    try {
        driver.findElement(by);
        return true;
    } catch (com.lazerycode.selenium.tests.NoSuchElementException e) {
        return false;
    }
}