public void shutDown() throws java.lang.InterruptedException {
    channel.closeFuture().sync();
    group.shutdownGracefully();
}