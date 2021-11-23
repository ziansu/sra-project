@java.lang.Override
public void run() {
    final java.lang.String threadName = java.lang.Thread.currentThread().getName();
    org.junit.Assert.assertFalse(threadInvocationRegistry.contains(threadName));
    standFunnel.post(new java.lang.Object(), com.google.protobuf.Any.getDefaultInstance());
    threadInvocationRegistry.add(threadName);
}