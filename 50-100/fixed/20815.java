@org.junit.Test
public void testFlowLogs() throws java.lang.Exception {
    testLogs("testApp1", "flows", "testFlow1", MockLogReader.TEST_NAMESPACE, null);
    testLogsFilter("testApp1", "flows", "testFlow1", MockLogReader.TEST_NAMESPACE, null);
    testLogsRunId("testApp1", "flows", "testFlow1", MockLogReader.TEST_NAMESPACE, null);
    try {
        testLogs("testApp1", "flows", "testFlow1", Constants.DEFAULT_NAMESPACE, null);
    } catch (java.lang.AssertionError e) {
        return ;
    }
    org.junit.Assert.fail();
}