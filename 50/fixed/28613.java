private void broadcastToClients(java.lang.Object obj) {
    for (net.ClientHandler ch : clientArray) {
        ch.send(obj);
    }
}