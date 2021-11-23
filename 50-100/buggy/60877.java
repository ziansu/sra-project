public boolean test(java.lang.String host, int port) {
    java.net.SocketAddress sockaddr = new java.net.InetSocketAddress(host, port);
    try (java.net.Socket socket = new java.net.Socket()) {
        socket.connect(sockaddr, connectTimeout);
        logger.info("[{}:{}] is reachable.", host, port);
        return true;
    } catch (java.lang.Throwable e) {
        logger.warn("[{}:{}] is NOT reachable.", host, port);
        return false;
    }
}