@org.junit.Test(expected = azkaban.executor.ExecutorManagerException.class)
public void testNoExecutorScenario() throws azkaban.executor.ExecutorManagerException {
    azkaban.utils.Props props = new azkaban.utils.Props();
    props.put(ExecutorManager.AZKABAN_USE_MULTIPLE_EXECUTORS, "true");
    azkaban.executor.ExecutorLoader loader = new azkaban.executor.MockExecutorLoader();
    @java.lang.SuppressWarnings(value = "unused")
    azkaban.executor.ExecutorManager manager = new azkaban.executor.ExecutorManager(props, loader, new azkaban.executor.AlerterHolder(props));
}