public void startServer() {
    while (true) {
        waitClientConnection();
        java.lang.System.out.println(("set positions and game mode:" + (gameMode)));
        gameMode();
        sendToAll();
        roomFull();
    } 
}