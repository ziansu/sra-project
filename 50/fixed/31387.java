public void add(uia.comm.SocketClient client) {
    if (client == null) {
        return ;
    }
    if ((this.activeClient) == null) {
        this.activeClient = client;
    }
    this.queues.add(client);
}