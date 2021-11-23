public void createNewGame() {
    resetChessBoardToNewGame();
    resetJudgeToNewGame(chessBoard);
    notifyGameEventListener();
}