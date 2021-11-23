private boolean executeCurrentGame() throws Assignment02.GameUnexecutedException {
    boolean bExecuted = false;
    if ((Controller.Driver.gameStatus) == (Controller.Driver.GAME_EXECUTED)) {
        throw new Assignment02.GameUnexecutedException("Re-run game exception");
    }
    if ((Controller.Driver.gameStatus) == (Controller.Driver.GAME_INITIATED)) {
        bExecuted = Controller.Driver.currentGame.executeGame();
        if (bExecuted) {
            Controller.Driver.gameStatus = Controller.Driver.GAME_EXECUTED;
            Controller.Data.writeToDB(Controller.Driver.currentGame);
        }
    }
    return bExecuted;
}