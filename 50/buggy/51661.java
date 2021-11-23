public static void grantPermission(org.openqa.selenium.WebDriver driver) {
    pageObjects.AuthorisedApplications_page.grant_btn(driver).click();
    org.testng.Assert.assertEquals(pageObjects.AuthorisedApplications_page.sub_title(driver).getText(), "Keep track of your authorised applications.");
}