public void sendToUDP(int connectionID, java.lang.Object object) {
    final java.util.List<T> connections = this.connections;
    for (T connection : connections) {
        if ((connection.id) == connectionID) {
            connection.sendUDP(object);
            break;
        }
    }
}