@org.junit.Test
public void testFlowLogs() throws java.lang.Exception {
    testLogs("testApp1", "flows", "testFlow1", MockLogReader.TEST_NAMESPACE, null);
    try {
        testLogs("testApp1", "flows", "testFlow1", Constants.DEFAULT_NAMESPACE, null);
        org.junit.Assert.fail();
    } catch (java.lang.AssertionError e) {
    }
    testLogsFilter("testApp1", "flows", "testFlow1", MockLogReader.TEST_NAMESPACE, null);
    testLogsRunId("testApp1", "flows", "testFlow1", MockLogReader.TEST_NAMESPACE, null);
}