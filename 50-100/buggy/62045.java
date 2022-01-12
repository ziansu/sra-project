private static java.util.ArrayList<net.arccotangent.pacchat.net.p2p.P2PConnectionHandler> getActiveClients() {
    java.util.ArrayList<net.arccotangent.pacchat.net.p2p.P2PConnectionHandler> clients;
    java.util.ArrayList<net.arccotangent.pacchat.net.p2p.P2PConnectionHandler> active = new java.util.ArrayList<>();
    clients = net.arccotangent.pacchat.Main.getP2PServer().getClients();
    for (net.arccotangent.pacchat.net.p2p.P2PConnectionHandler client : clients) {
        if (client.isConnected()) {
            active.add(client);
        }
    }
    return active;
}