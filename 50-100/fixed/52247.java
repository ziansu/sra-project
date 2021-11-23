protected org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor createExecutorService() {
    java.lang.String pattern = getCamelContext().getExecutorServiceManager().getThreadNamePattern();
    java.util.concurrent.ThreadFactory factory = new org.apache.camel.util.concurrent.CamelThreadFactory(pattern, "NettyOrderedWorker", true);
    return new org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor(getMaximumPoolSize(), 0L, 0L, 30, java.util.concurrent.TimeUnit.SECONDS, factory);
}