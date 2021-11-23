@com.stamps.print.core.BeforeTest
public void setup() {
    testHelper.beginTest();
    try {
        launchBrowser();
        getUrl();
        signIn();
    } catch (java.lang.Exception e) {
    }
    testHelper.endTest();
}