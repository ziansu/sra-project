private void advanceTurn() {
    if (playerOneID.equals(gameState.getCurrentPlayerID()))
        gameState = gameState.updatePlayer(playerTwoID);
    else
        gameState = gameState.updatePlayer(playerOneID);
    
}