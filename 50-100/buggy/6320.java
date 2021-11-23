@org.junit.Test
public void testPollExcepts() throws java.lang.Exception {
    CloudWatchMonitor c = new CloudWatchMonitor(mockClient);
    c.setLogsLocation(new com.amazonaws.services.codebuild.model.LogsLocation());
    com.amazonaws.services.codebuild.model.InvalidInputException e = new com.amazonaws.services.codebuild.model.InvalidInputException("no logs");
    org.mockito.Mockito.when(mockClient.getLogEvents(org.mockito.Matchers.any(com.amazonaws.services.logs.model.GetLogEventsRequest.class))).thenThrow(e);
    c.pollForLogs();
    assertLogsContainExceptionMessage(c, e);
}