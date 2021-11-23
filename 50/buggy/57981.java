public void useSoldier(shared.locations.HexLocation h) {
    int currentPlayer = game.getTurnTracker().getCurrentTurn();
    diceIsSevenMoveRobber(h);
    resourceManager.soldierUsed(currentPlayer);
}