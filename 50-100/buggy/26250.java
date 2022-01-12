@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable r) {
    com.hazelcast.spi.impl.operationservice.impl.InvocationMonitor.InvocationMonitorThread thread = new com.hazelcast.spi.impl.operationservice.impl.InvocationMonitor.InvocationMonitorThread(nodeEngine.getNode().getHazelcastThreadGroup());
    thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() {
        @java.lang.Override
        public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
            logger.severe(e);
        }
    });
    return thread;
}