public synchronized void disconnectToServer() {
    com.musichub.core.CapitalizeClient.log("disconnectToServer");
    if ((receiveDaemon) != null)
        receiveDaemon.stop();
    
    if ((com.musichub.core.CapitalizeClient.playDaemon) != null)
        com.musichub.core.CapitalizeClient.playDaemon.stop();
    
    try {
        receiveDaemon.socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    play = false;
    connected = false;
}