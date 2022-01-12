@java.lang.Override
public void onTurnSuccess(int computerMove) {
    if ((isGameOver) || (computerMove == (-1))) {
        return ;
    }
    setXBackground(levelPlayer1, computerMove);
    fillGameGrid(computerMove, Constants.PLAYER2);
    areButtonsClicked[computerMove] = true;
    asyncService.checkForWinner(gameGrid, Constants.PLAYER2, this);
}