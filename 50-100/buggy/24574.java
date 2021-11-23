private void keepAlive() {
    long time = java.lang.System.currentTimeMillis();
    final java.util.List<T> connections = this.connections;
    for (int i = 0, n = connections.size(); i < n; i++) {
        T connection = connections.get(i);
        if (connection.tcp.needsKeepAlive(time))
            connection.sendTCP(FrameworkMessage.keepAlive);
        
    }
}