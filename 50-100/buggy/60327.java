@org.junit.Test
public void testChild() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    com.palantir.common.concurrent.ExecutorInheritableThreadLocalTest.localInt.set(10);
    java.util.concurrent.Future<?> future = exec.submit(new java.util.concurrent.Callable<java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void call() throws java.lang.Exception {
            com.palantir.common.concurrent.ExecutorInheritableThreadLocalTest.outputList.add(com.palantir.common.concurrent.ExecutorInheritableThreadLocalTest.localInt.get());
            return null;
        }
    });
    future.get();
    java.lang.Thread.sleep(10);
    assertEquals(com.google.common.collect.ImmutableList.of(11, 12, 13), com.palantir.common.concurrent.ExecutorInheritableThreadLocalTest.outputList);
}