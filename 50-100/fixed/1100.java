void saveGame() {
    previousGameState = new com.example.stuart.draughts.Game(againstComputer, true);
    previousGameState.currentBoard.copyBoard(this.currentBoard);
    previousGameState.legalMoves = new com.example.stuart.draughts.Board[this.legalMoves.length];
    for (int i = 0; i < (this.legalMoves.length); i++) {
        previousGameState.legalMoves[i] = new com.example.stuart.draughts.Board();
        previousGameState.legalMoves[i].copyBoard(this.legalMoves[i]);
    }
    previousGameState.player1Turn = this.player1Turn;
}