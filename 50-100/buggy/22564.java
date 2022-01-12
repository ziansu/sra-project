@java.lang.Override
public void run() {
    try {
        int playerNumber = this.addPlayer();
        if (playerNumber < 0) {
            this.handleGameFull();
        }
        this.constructClientIdentifier(playerNumber);
        this.send((playerNumber + ""));
        this.registerSelf();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        this.safelyShutdownClientConnection();
    }
}