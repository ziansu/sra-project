@com.stamps.print.core.BeforeTest(alwaysRun = true)
public void setup() {
    testHelper.beginTest();
    try {
        launchBrowser();
    } catch (java.lang.Exception e) {
    }
    testHelper.endTest();
}