@org.junit.Ignore
@org.junit.Test
public void testFetchAllActiveFlows() throws azkaban.executor.ExecutorManagerException, java.io.IOException {
    testSetUpForRunningFlows();
    java.util.List<azkaban.executor.ExecutableFlow> flows = manager.getRunningFlows();
    for (azkaban.utils.Pair<azkaban.executor.ExecutionReference, azkaban.executor.ExecutableFlow> pair : activeFlows.values()) {
        org.junit.Assert.assertTrue(flows.contains(pair.getSecond()));
    }
}