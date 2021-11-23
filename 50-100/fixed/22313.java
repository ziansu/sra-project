@org.testng.annotations.Test(groups = "dev", retryAnalyzer = io.wcm.qa.galenium.listeners.RetryAnalyzer.class)
public void verificationTest() {
    loadStartUrl();
    io.wcm.qa.galenium.util.VerificationUtil.verify(new io.wcm.qa.galenium.verification.CurrentUrlVerification("Conference"), new io.wcm.qa.galenium.verification.PageTitleVerification("Conference"), new org.adaptto.galenium.example.verifications.LogoVerification(), new io.wcm.qa.galenium.verification.VisibilityVerification(org.adaptto.galenium.example.constants.Selectors.SELECTOR_STAGE));
    if (isMobile()) {
        io.wcm.qa.galenium.util.VerificationUtil.verify(new io.wcm.qa.galenium.verification.InvisibilityVerification(org.adaptto.galenium.example.constants.Selectors.SELECTOR_NAV_LINK_HOME), new io.wcm.qa.galenium.verification.InvisibilityVerification(org.adaptto.galenium.example.constants.Selectors.SELECTOR_NAV_LINK_CONFERENCE));
    }else {
        io.wcm.qa.galenium.util.VerificationUtil.verify(new io.wcm.qa.galenium.verification.NoCssClassVerification(org.adaptto.galenium.example.constants.Selectors.SELECTOR_NAV_LINK_HOME, org.adaptto.galenium.example.ConferenceIT.CSS_CLASS_NAVLINK_ACTIVE), new io.wcm.qa.galenium.verification.CssClassVerification(org.adaptto.galenium.example.constants.Selectors.SELECTOR_NAV_LINK_CONFERENCE, org.adaptto.galenium.example.ConferenceIT.CSS_CLASS_NAVLINK_ACTIVE));
    }
    io.wcm.qa.galenium.util.VerificationUtil.verify(new io.wcm.qa.galenium.verification.LinkTargetVerification(org.adaptto.galenium.example.constants.Selectors.SELECTOR_LOGO));
}