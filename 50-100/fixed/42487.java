@org.testng.annotations.Test
public void myLogTest() throws java.lang.Exception {
    app.getNavigationHelper().goToMyLogPage();
    app.getBankIdAuthorizationHalper().initBankIdAuthorizationFromMyLogPage();
    app.getBankIdAuthorizationHalper().privatBankAuthorization();
    org.junit.Assert.assertTrue(app.getServiceHelper().isMyLogDisplayed());
}