@java.lang.Override
public void run() {
    try {
        P2PNode.neighbors.clear();
        java.lang.String[] peers = RequestSender.getPeers();
        for (java.lang.String peer : peers) {
            P2PNode.neighbors.add(peer);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}