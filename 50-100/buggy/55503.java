@cucumber.api.java.en.Then(value = "the shopping cart should be updated")
public void checkUpdate() {
    wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 15);
    org.openqa.selenium.WebElement quantity = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.name("quantity")));
    junit.framework.Assert.assertEquals("2", quantity.getAttribute("value"));
    org.openqa.selenium.WebElement total = driver.findElement(org.openqa.selenium.By.cssSelector("td.wpsc_product_price.wpsc_product_price_0"));
    junit.framework.Assert.assertEquals("$24.00", total.getText());
}