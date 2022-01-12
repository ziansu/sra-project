private void gameOverP2() {
    newGameSetup();
    javafx.application.Platform.runLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            new ErrorBox("You Win!", "You have won this game!");
        }
    });
    if (isHost) {
        GameServer.closeConnection();
        java.lang.System.out.println("Server closed");
    }
}