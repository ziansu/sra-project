public void sendToUDP(int connectionID, java.lang.Object object) {
    final java.util.List<T> connections = this.connections;
    for (int i = 0, n = connections.size(); i < n; i++) {
        T connection = connections.get(i);
        if ((connection.id) == connectionID) {
            connection.sendUDP(object);
            break;
        }
    }
}