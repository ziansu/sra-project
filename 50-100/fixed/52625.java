@java.lang.Override
public void run() {
    while (running) {
        if ((bufferedPlayerData) != null) {
            sendObj(new game.PlayerData(bufferedPlayerData));
        }
        try {
            java.lang.Thread.sleep(((long) (1000 / (TICK_RATE))));
        } catch (java.lang.InterruptedException ex) {
        }
    } 
    InThread.interrupt();
}