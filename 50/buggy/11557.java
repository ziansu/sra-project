public void createNewGame() {
    resetChessBoardToNewGame();
    resetJudgeToNewGame(chessBoard);
    setCurrentChessPointValid(true);
    notifyGameEventListener();
}