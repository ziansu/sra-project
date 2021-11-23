public synchronized void disconnectClient(connection.Client client) {
    this.allClients.remove(client);
}