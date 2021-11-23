@java.lang.Override
public void start() throws java.lang.IllegalStateException {
    super.start();
    if (((java.lang.Math.random()) * 10) >= 5)
        nextPlayer = playerOne;
    else
        nextPlayer = playerTwo;
    
    nextPlayer = playerTwo;
    clearBoard();
    if ((getPlayerToMove()) == (playerOne)) {
        player1Char = 'B';
        player2Char = 'W';
    }else {
        player2Char = 'W';
        player1Char = 'B';
    }
    initBoard();
}