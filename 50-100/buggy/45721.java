@org.junit.Test
@com.autonomy.abc.base.Role(value = com.autonomy.abc.selenium.find.application.UserRole.BIFHI)
@com.hp.autonomy.frontend.selenium.framework.logging.ActiveBug(value = "FIND-703")
public void testBIUserCannotRouteToSplashPage() {
    final java.lang.String splashURL = (getAppUrl()) + "public/search/splash";
    getDriver().get(splashURL);
    com.hp.autonomy.frontend.selenium.util.Waits.loadOrFadeWait();
    findPage = getElementFactory().getFindPage();
    com.hp.autonomy.frontend.selenium.framework.state.TestStateAssert.assertThat("Splash page logo not visible", findPage.footerLogo(), org.hamcrest.Matchers.not(org.openqa.selenium.lift.Matchers.displayed()));
    com.hp.autonomy.frontend.selenium.framework.state.TestStateAssert.assertThat("Has redirected away from Splash page", getDriver().getCurrentUrl(), org.hamcrest.Matchers.not(splashURL));
}