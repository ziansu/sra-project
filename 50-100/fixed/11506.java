void connect() throws java.lang.InterruptedException {
    final io.netty.channel.ChannelFuture future;
    synchronized(lock) {
        connectFuture = bootstrap.connect(host, port);
        future = connectFuture;
    }
    future.sync();
    synchronized(lock) {
        while (((root) == null) && (future.channel().isOpen())) {
            lock.wait();
        } 
    }
}