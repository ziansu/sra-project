private void blockReceive(java.lang.String message) {
    java.lang.System.out.println("CO1 called");
    int difficulty;
    server.BlockHandler bh = new server.BlockHandler();
    difficulty = bh.blockReceive(message, true);
    if (difficulty == (-1)) {
        terminateConnection();
    }else {
        sendDifficulty(difficulty);
    }
}