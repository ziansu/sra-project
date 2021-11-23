public void close() {
    waazdoh.cp2p.network.NodeConnectionFactory._bootstrap = null;
    if ((workerGroup) != null) {
        workerGroup.shutdownGracefully();
        synchronized(nodes) {
            for (io.netty.channel.Channel c : nodes.keySet()) {
                try {
                    c.close();
                } catch (java.lang.Exception e) {
                    log.error("ERROR in closing channel");
                    log.error(e);
                }
            }
        }
        workerGroup = null;
    }
}