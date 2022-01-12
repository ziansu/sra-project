@org.junit.Ignore
@org.junit.Test
public void testFetchActiveFlowByProject() throws azkaban.executor.ExecutorManagerException, java.io.IOException {
    testSetUpForRunningFlows();
    final java.util.List<java.lang.Integer> executions = this.manager.getRunningFlows(this.flow1.getProjectId(), this.flow1.getFlowId());
    org.junit.Assert.assertTrue(executions.contains(this.flow1.getExecutionId()));
    org.junit.Assert.assertTrue(this.manager.isFlowRunning(this.flow1.getProjectId(), this.flow1.getFlowId()));
}