public void startServer() {
    while (true) {
        waitClientConnection();
        gameMode();
        java.lang.System.out.println(("set positions and game mode:" + (gameMode)));
        sendToAll();
        roomFull();
    } 
}