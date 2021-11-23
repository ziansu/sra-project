public synchronized void spawnActiveGameThread(java.lang.String gameType, com.netboard.game.Player host, com.netboard.game.Player guest) {
    com.netboard.server.ActiveGameThread agt = new com.netboard.server.ActiveGameThread(gameType, host, guest, this);
    java.lang.Thread gameThread = new java.lang.Thread(agt);
    gameThread.start();
    log("Spawned an ActiveGameThread to handle game");
}