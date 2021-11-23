private void advanceTurn() {
    if ((gameState.getCurrentPlayerID()) == (playerOneID))
        gameState = gameState.updatePlayer(playerTwoID);
    else
        gameState = gameState.updatePlayer(playerOneID);
    
}