@org.junit.Ignore
@org.junit.Test
public void testFetchAllActiveFlows() throws azkaban.executor.ExecutorManagerException, java.io.IOException {
    testSetUpForRunningFlows();
    final java.util.List<azkaban.executor.ExecutableFlow> flows = this.manager.getRunningFlows();
    for (final azkaban.utils.Pair<azkaban.executor.ExecutionReference, azkaban.executor.ExecutableFlow> pair : this.activeFlows.values()) {
        org.junit.Assert.assertTrue(flows.contains(pair.getSecond()));
    }
}