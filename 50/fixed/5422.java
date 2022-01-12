@com.consol.citrus.testng.AfterSuite(alwaysRun = true)
public void afterSuite(com.consol.citrus.testng.ITestContext testContext) {
    if ((citrus) != null) {
        citrus.afterSuite(testContext.getSuite().getName());
    }
}