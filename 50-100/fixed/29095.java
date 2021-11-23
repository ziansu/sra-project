public void closeModal() {
    org.openqa.selenium.WebElement closeButton = browser.driver.findElement(org.openqa.selenium.By.className("close"));
    waitForElementToBeClickable(closeButton);
    closeButton.click();
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
}