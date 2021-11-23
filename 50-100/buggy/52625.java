@java.lang.Override
public void run() {
    while (running) {
        if (((java.lang.System.currentTimeMillis()) - (lastPacket)) >= 20000) {
            java.lang.System.out.println("The server is not responding! :(");
            running = false;
        }else {
            if ((bufferedPlayerData) != null) {
                sendObj(new game.PlayerData(bufferedPlayerData));
            }
        }
        try {
            java.lang.Thread.sleep(((long) (1000 / (TICK_RATE))));
        } catch (java.lang.InterruptedException ex) {
        }
    } 
    InThread.interrupt();
}