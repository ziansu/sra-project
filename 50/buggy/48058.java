public synchronized void requestReport() {
    if (clients.isEmpty()) {
        log("Client list is empty!");
        return ;
    }
    for (server.ConnectedClient client : clients) {
        client.requestReport();
    }
}