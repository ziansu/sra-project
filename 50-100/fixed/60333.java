public void testCustomInput() throws java.io.IOException, java.lang.InterruptedException, java.sql.SQLException {
    testName = java.lang.Thread.currentThread().getStackTrace()[1].getMethodName();
    com.kfplc.ci.datafeed.TestHelper.logWhatToTest(testName, "  Test the job with custom input data");
    com.kfplc.ci.datafeed.TestHelper.preJUnitCleanUp(TestCasePosition.LAST);
    com.kfplc.ci.datafeed.LargeBodsTestHelper.prapareInputWithCustomData("1FAE11101052017256949560000051.000000000000000000000000010000002052017");
    try {
        long executionTime = com.kfplc.ci.datafeed.LargeBodsTestHelper.invokeLargeBODSJob();
        com.kfplc.ci.datafeed.LargeBodsTestHelper.postJUnitCleanUp(TestCasePosition.LAST);
    } finally {
        com.kfplc.ci.datafeed.LargeBodsTestHelper.assertCSVFileHasData();
    }
}