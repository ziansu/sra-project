public java.lang.String getMemberId() {
    new org.openqa.selenium.support.ui.WebDriverWait(driver, 30).until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.cssSelector("em[class='emblue']")));
    java.lang.String id = driver.findElement(org.openqa.selenium.By.cssSelector("em[class='emblue']")).getText();
    java.lang.System.out.println(id);
    return id;
}