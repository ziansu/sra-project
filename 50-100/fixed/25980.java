public <D> tnet.communication.TNetData<D> read() {
    if (canCommunicate()) {
        for (tnet.sockets.TSocket client : server.getClients()) {
            tnet.communication.TNetData<D> data = this.<D>read(client.key());
            if (data != null) {
                return data;
            }
        }
    }
    return null;
}