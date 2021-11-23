@org.testng.annotations.AfterClass(alwaysRun = true)
public void baseAfterClass() {
    java.lang.System.out.println(("Report url = " + (reportiumClient.getReportUrl())));
    if ((driver) != null) {
        if (device) {
            endLogging();
        }
        driver.quit();
    }
}