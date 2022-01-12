@org.testng.annotations.AfterMethod(alwaysRun = true)
public void afterTest(org.testng.ITestResult testResult) {
    int status = testResult.getStatus();
    if ((driver) != null) {
        driver.close();
    }
    switch (status) {
        case org.testng.ITestResult.FAILURE :
            reportiumClient.testStop(com.perfecto.reportium.test.result.TestResultFactory.createFailure("An error occurred", testResult.getThrowable()));
            break;
        case org.testng.ITestResult.SUCCESS_PERCENTAGE_FAILURE :
        case org.testng.ITestResult.SUCCESS :
            reportiumClient.testStop(com.perfecto.reportium.test.result.TestResultFactory.createSuccess());
            break;
        case org.testng.ITestResult.SKIP :
            break;
        default :
            throw new com.perfecto.reportium.exception.ReportiumException(("Unexpected status " + status));
    }
}