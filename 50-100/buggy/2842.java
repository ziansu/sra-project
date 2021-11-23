public void endSession() throws java.io.IOException {
    for (java.lang.Thread t : serverListeners) {
        t.interrupt();
    }
    for (java.net.Socket s : clients) {
        s.getOutputStream().flush();
        s.close();
    }
    java.lang.System.out.println("MMServer seisson ended.");
}