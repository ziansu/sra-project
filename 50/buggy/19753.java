private void broadcast(java.lang.String message) {
    for (net.bourgau.philippe.concurrency.kata.Output client : clients.keySet()) {
        safeWrite(client, message);
    }
}