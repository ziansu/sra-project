@org.testng.annotations.Test(description = "Test case for info level logging through the log API")
public void testLogInfo() throws java.io.IOException {
    consoleOutput.reset();
    final java.lang.String logMsg = "Test info log";
    final java.lang.String expectedLog = ("INFO [] - " + logMsg) + " \n";
    org.ballerinalang.test.utils.BTestUtils.invoke(result, "testInfo", new org.ballerinalang.model.values.BValue[]{ new org.ballerinalang.model.values.BString(logMsg) });
    org.testng.Assert.assertEquals(consoleOutput.toString().substring(timestampFormat.length()), expectedLog);
}