@cucumber.api.java.en.When(value = "I go to HackADay login page")
public void pressLogin() {
    hAD.goToLogin();
    junit.framework.Assert.assertTrue("Expected to be at login page", hAD.checkAtLoginPage());
}