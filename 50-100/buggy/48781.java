@cucumber.api.java.en.Then(value = "^isCompanyIdError message show$")
public void isCompanyIdErrorMmessageShow(java.util.Map<java.lang.String, java.lang.String> dataList) throws java.lang.Throwable {
    org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 5);
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.id("is-company-id-error-message")));
    try {
        java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        org.junit.Assert.assertEquals(dataList.get("displayShow"), driver.findElement(org.openqa.selenium.By.id("is-company-id-error-message")).getCssValue("display"));
    } finally {
        driver.quit();
    }
}