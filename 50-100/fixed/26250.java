@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable r) {
    java.lang.Thread thread = new com.hazelcast.spi.impl.operationservice.impl.InvocationMonitor.InvocationMonitorThread(r, nodeEngine.getNode().getHazelcastThreadGroup());
    thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() {
        @java.lang.Override
        public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
            logger.severe(e);
        }
    });
    return thread;
}