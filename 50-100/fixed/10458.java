private void shutdown() {
    if ((eventLoopGroup) != null) {
        eventLoopGroup.shutdownGracefully();
    }
    if ((serverThread) != null) {
        org.codice.alliance.video.stream.mpegts.UdpStreamMonitor.LOGGER.debug("shutting down monitor server thread");
        joinServerThread();
        serverThread = null;
    }
    if ((udpStreamProcessor) != null) {
        udpStreamProcessor.shutdown();
    }
}