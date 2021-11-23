public synchronized void disconnectClient(connection.Client client) {
    if (client.isReady()) {
        (this.playersReady)--;
    }
    this.allClients.remove(client);
}