public synchronized void spawnActiveGameThread(java.lang.String gameType, com.netboard.game.Player host, com.netboard.game.Player guest) {
    com.netboard.server.ActiveGameThread agt = new com.netboard.server.ActiveGameThread(gameType, host, guest);
    java.lang.Thread gameThread = new java.lang.Thread(agt);
    gameThread.start();
    log("Spawned an ActiveGameThread to handle game");
    try {
        listenForConnections();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}