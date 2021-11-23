private boolean isAlertPresent() {
    try {
        driver.switchTo().alert();
        return true;
    } catch (com.lazerycode.selenium.tests.NoAlertPresentException e) {
        return false;
    }
}