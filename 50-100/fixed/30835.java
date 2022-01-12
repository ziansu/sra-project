@org.junit.Test
public void testCauseOnly() {
    java.lang.RuntimeException cause = new java.lang.RuntimeException("My-Test-Cause");
    org.jtrim.taskgraph.TaskGraphExecutionException ex = new org.jtrim.taskgraph.TaskGraphExecutionException(cause);
    assertSame(cause, ex.getCause());
    assertTrue(ex.getMessage().contains(cause.getMessage()));
}