@java.lang.Override
public void run() throws java.io.IOException {
    checkQuitGame();
    determinePlayer(TicTacToe.turns);
    updateGridPiece();
    pieceExist();
    isWinner();
}