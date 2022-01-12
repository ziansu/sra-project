@org.junit.Test(expected = azkaban.executor.ExecutorManagerException.class)
public void testNoExecutorScenario() throws azkaban.executor.ExecutorManagerException {
    final azkaban.utils.Props props = new azkaban.utils.Props();
    props.put(ExecutorManager.AZKABAN_USE_MULTIPLE_EXECUTORS, "true");
    final azkaban.executor.ExecutorLoader loader = new azkaban.executor.MockExecutorLoader();
    new azkaban.executor.ExecutorManager(props, loader, new azkaban.executor.AlerterHolder(props));
}