private void postMoveProcedure() {
    if ((currentPlayer) == (players.get(0)))
        currentPlayer = players.get(1);
    else
        currentPlayer = players.get(0);
    
    if (hasWinner())
        endGame();
    
    if (isCatsGame())
        endGame();
    
}