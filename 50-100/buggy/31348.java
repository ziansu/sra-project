@org.junit.Ignore
@org.junit.Test
public void testFetchActiveFlowByProject() throws azkaban.executor.ExecutorManagerException, java.io.IOException {
    testSetUpForRunningFlows();
    java.util.List<java.lang.Integer> executions = manager.getRunningFlows(flow1.getProjectId(), flow1.getFlowId());
    org.junit.Assert.assertTrue(executions.contains(flow1.getExecutionId()));
    org.junit.Assert.assertTrue(manager.isFlowRunning(flow1.getProjectId(), flow1.getFlowId()));
}