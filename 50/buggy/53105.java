@java.lang.Override
public void run() throws java.io.IOException {
    checkQuitGame();
    determinePlayer(TicTacToe.turns);
    updateGridPiece();
    java.lang.System.out.println("COOL");
    pieceExist();
    isWinner();
}