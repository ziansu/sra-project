@org.testng.annotations.Test
public void checkLoginToAdmin() throws java.lang.Exception {
    loginToAdminArea(driver);
    driver.findElement(org.openqa.selenium.By.xpath(loginText));
}