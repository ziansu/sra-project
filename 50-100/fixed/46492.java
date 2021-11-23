@org.junit.Before
public void setUp() throws java.lang.Exception {
    sendJobInfo(getClass().getPackage().getName(), "1.1", 2);
    super.setUp();
    className = getClass().getSimpleName();
    mTestResult = new com.automatic.tests.results.TestResult("SDK Test", className);
    mTestResult.testDescription = "REST API tests for the Automatic Android SDK";
    getActivity();
}