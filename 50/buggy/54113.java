protected io.netty.util.concurrent.EventExecutorGroup createExecutorService() {
    java.lang.String pattern = getCamelContext().getExecutorServiceManager().getThreadNamePattern();
    java.util.concurrent.ThreadFactory factory = new org.apache.camel.util.concurrent.CamelThreadFactory(pattern, "NettyEventExecutorGroup", true);
    return new io.netty.util.concurrent.DefaultEventExecutorGroup(configuration.getMaximumPoolSize(), factory);
}