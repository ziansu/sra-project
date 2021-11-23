@org.testng.annotations.BeforeClass
public static void setUpClass() throws java.lang.Exception {
    ua.artcode.week3.day1.Tests.Fixture.driverWrapper = new ua.artcode.week3.day1.utils.WebDriverWrapper(ua.artcode.week3.day1.utils.WebDriverFactory.initDriver());
    ua.artcode.week3.day1.Tests.Fixture.driverWrapper.manage().timeouts().implicitlyWait(40, java.util.concurrent.TimeUnit.SECONDS);
    try {
        ua.artcode.week3.day1.Tests.Fixture.ellos = new ua.artcode.week3.day1.Pages.Ellos(ua.artcode.week3.day1.Tests.Fixture.driverWrapper);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    ua.artcode.week3.day1.logger.Log4Test.info("Start Test Suite execution");
}