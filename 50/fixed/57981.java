public void useSoldier() {
    int currentPlayer = game.getTurnTracker().getCurrentTurn();
    resourceManager.soldierUsed(currentPlayer);
}