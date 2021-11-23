@ui.ClientPortal.Test
public final void forgotPassword() {
    ClientPortal.ClientPortalLoginPage.Goto().clickForgotPasswordLink().verifyResetPasswordHeader(true).verifyResetPasswordText(true).verifySignInText(false);
    core.Browser.back(common.ClientPortalBrowser.Instance());
    ClientPortal.ClientPortalLoginPage.Goto().verifyResetPasswordHeader(false).verifyResetPasswordText(false).verifySignInText(true);
}