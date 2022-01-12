public boolean getAllReady() {
    java.util.ArrayList<com.bradleyboxer.corndog.server.ServerClientManager> clients = Server.sa.getClients();
    if ((clients.size()) == 0) {
        return false;
    }
    for (com.bradleyboxer.corndog.server.ServerClientManager cm : clients) {
        if ((!(cm.getReadyState())) || (gameRunning)) {
            return false;
        }
    }
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
    }
    return true;
}