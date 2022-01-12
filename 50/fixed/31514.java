public void clickBtnSignIn() throws java.lang.Exception {
    com.Yatra.Utils.BrowserActions.clickOnElement(btnSignIn, driver, "Sign In");
    com.Yatra.Utils.Utils.waitForPageLoad(driver);
}