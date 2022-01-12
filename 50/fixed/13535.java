@org.junit.Test
public void testFetchEmptyExecutors() throws java.lang.Exception {
    java.util.Collection<java.lang.String> execNames = store.fetchExecutorNames();
    assertEquals(0, execNames.size());
}