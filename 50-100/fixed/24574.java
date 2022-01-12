private void keepAlive() {
    long time = java.lang.System.currentTimeMillis();
    final java.util.List<T> connections = this.connections;
    for (T connection : connections) {
        if (connection.tcp.needsKeepAlive(time))
            connection.sendTCP(FrameworkMessage.keepAlive);
        
    }
}