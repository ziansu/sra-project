private void shutdown() {
    if ((serverThread) != null) {
        org.codice.alliance.video.stream.mpegts.UdpStreamMonitor.LOGGER.debug("shutting down monitor server thread");
        joinServerThread();
        serverThread = null;
    }
    if ((eventLoopGroup) != null) {
        eventLoopGroup.shutdownGracefully();
    }
    if ((udpStreamProcessor) != null) {
        udpStreamProcessor.shutdown();
    }
}