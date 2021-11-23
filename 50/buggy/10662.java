@java.lang.Override
public void testIgnored(final org.junit.runner.Description description) throws java.lang.Exception {
    if (testingThisTest(description)) {
        stepEventBus().testIgnored();
        stepEventBus().testFinished();
        endTest();
    }
}