@cucumber.api.java.en.Then(value = "^create Credentials Authentication Options are not displayed in the Credentials Page$")
public void verifyCreateCredentialsAuthenticationOptionsAreNotDisplayed() throws java.lang.Throwable {
    org.fundacionjala.automation.framework.pages.tablet.scheduler.CredentialsPage credentials = new org.fundacionjala.automation.framework.pages.tablet.scheduler.CredentialsPage();
    org.testng.Assert.assertFalse(credentials.isUserNameTextFieldPresent());
    org.testng.Assert.assertFalse(credentials.isPasswordTextFieldPresent());
    org.testng.Assert.assertFalse(credentials.isCreateAsCheckBoxPresent());
    org.testng.Assert.assertFalse(credentials.isCreateInBehalfOfTextFieldPresent());
}