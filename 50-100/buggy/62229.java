public synchronized void disconnectToServer() {
    com.musichub.core.CapitalizeClient.log("disconnectToServer");
    receiveDaemon.stop();
    com.musichub.core.CapitalizeClient.playDaemon.stop();
    try {
        receiveDaemon.socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    play = false;
    connected = false;
}