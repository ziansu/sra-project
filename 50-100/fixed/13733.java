public void run() {
    if ((!(s.isConnected())) && (!(closed))) {
        try {
            s.connect();
            notConnectedServers.remove(s);
        } catch (java.io.IOException | java.lang.InterruptedException | de.mickare.xserver.exceptions.NotInitializedException e) {
            notifyNotConnected(s, e);
        }
    }
}