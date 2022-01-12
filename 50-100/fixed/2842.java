public void endSession() throws java.io.IOException {
    for (java.lang.Thread t : serverListeners.values()) {
        t.interrupt();
    }
    for (java.net.Socket s : clients.values()) {
        s.getOutputStream().flush();
        s.close();
    }
    java.lang.System.out.println("MMServer seisson ended.");
}