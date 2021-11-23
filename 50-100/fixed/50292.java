public void shutDown() {
    if ((bootstrap) != null) {
        io.netty.channel.EventLoopGroup group = bootstrap.group();
        if (group != null) {
            group.shutdownGracefully(0, 10, java.util.concurrent.TimeUnit.SECONDS);
        }
    }
    if ((queryExecutor) != null) {
        queryExecutor.shutdown();
    }
    serverAddress = null;
}