private java.lang.String closeAlertAndGetItsText() {
    try {
        com.lazerycode.selenium.tests.Alert alert = driver.switchTo().alert();
        java.lang.String alertText = alert.getText();
        if (acceptNextAlert) {
            alert.accept();
        }else {
            alert.dismiss();
        }
        return alertText;
    } finally {
        acceptNextAlert = true;
    }
}