public void shutDown() {
    if ((bootstrap) != null) {
        io.netty.channel.EventLoopGroup group = bootstrap.group();
        if (group != null) {
            io.netty.util.concurrent.Future<?> shutDownFuture = group.shutdownGracefully(0, 10, java.util.concurrent.TimeUnit.SECONDS);
            try {
                shutDownFuture.await();
            } catch (java.lang.InterruptedException e) {
                org.apache.flink.runtime.query.netty.KvStateServer.LOG.error("Interrupted during shut down", e);
            }
        }
    }
    if ((queryExecutor) != null) {
        queryExecutor.shutdown();
    }
    serverAddress = null;
}