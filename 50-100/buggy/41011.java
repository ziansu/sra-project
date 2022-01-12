@org.junit.Test
public void testLargeDatafeed() throws java.io.IOException, java.lang.InterruptedException, java.sql.SQLException {
    testName = java.lang.Thread.currentThread().getStackTrace()[1].getMethodName();
    com.kfplc.ci.datafeed.TestHelper.logWhatToTest(testName, "  Test the execution time of a large BODS Job");
    com.kfplc.ci.datafeed.TestHelper.preJUnitCleanUp(TestCasePosition.LAST);
    com.kfplc.ci.datafeed.LargeBodsTestHelper.prepareLargeInputFile();
    long executionTime = com.kfplc.ci.datafeed.LargeBodsTestHelper.invokeLargeBODSJob();
    com.kfplc.ci.datafeed.LargeBodsTestHelper.postJUnitCleanUp(TestCasePosition.LAST);
    com.kfplc.ci.datafeed.LargeBodsTestHelper.assertExecutionTimeInLimit(executionTime);
}