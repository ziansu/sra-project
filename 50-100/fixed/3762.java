public void close() {
    waazdoh.cp2p.network.NodeConnectionFactory._bootstrap = null;
    if ((workerGroup) != null) {
        workerGroup.shutdownGracefully();
        synchronized(nodes) {
            for (io.netty.channel.Channel c : nodes.keySet()) {
                c.close();
            }
        }
        workerGroup = null;
    }
}