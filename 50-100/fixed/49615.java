@org.testng.annotations.Test
public void enabledExceptionTest() throws java.lang.Exception {
    org.springframework.ui.Model model = new org.springframework.ui.ExtendedModelMap();
    java.lang.String viewTemplate = twoFactorAuthenticationController.enabled(model);
    org.testng.Assert.assertEquals(true, model.asMap().get(TwoFactorAuthenticationController.ATTRIBUTE_2FA_IS_ENABLED));
    org.testng.Assert.assertEquals("Verification code", model.asMap().get(TwoFactorAuthenticationController.ATTRIBUTE_HEADER_2FA_VERIFY_CODE));
    org.testng.Assert.assertEquals("view-login", viewTemplate);
}