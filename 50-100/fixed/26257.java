@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(delayMillis);
        long last = java.lang.System.nanoTime();
        long current;
        while (running) {
            current = java.lang.System.nanoTime();
            while ((current - last) >= (intervalNanos)) {
                sendObjectsToClients();
                last += intervalNanos;
            } 
        } 
    } catch (java.lang.InterruptedException e) {
        com.tri.pgs.server.network.udp.UDPBroadcastThread.logger.log(java.util.logging.Level.SEVERE, ((com.tri.pgs.server.network.udp.UDPBroadcastThread.class.getSimpleName()) + " was interrupted while sleeping!"), e);
    }
}