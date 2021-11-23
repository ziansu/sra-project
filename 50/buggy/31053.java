@cucumber.api.java.en.Then(value = "^user should be able to signup successfully$")
public void user_should_be_able_to_signup_successfully() throws java.lang.Throwable {
    org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(com.udemy.uat.utilities.Driver.getInstance(), 20);
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(homePage.fullName));
    org.junit.Assert.assertEquals(homePage.fullName, "Hasan Huseyin");
}