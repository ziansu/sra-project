private void releaseConnectionLatch() {
    org.apache.tomcat.util.threads.LimitLatch latch = connectionLimitLatch;
    if (latch != null)
        latch.releaseAll();
    
    connectionLimitLatch = null;
}