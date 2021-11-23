public boolean canPlayCard() {
    client.managers.GameManager gm = client.communication.ClientCommunicator.getSingleton().getGameManager();
    java.lang.Integer playerId = client.communication.ClientCommunicator.getSingleton().getPlayerId();
    boolean canBuild = (gm.canPlayCard()) && ((gm.getGame().getTurnTracker().getCurrentTurn()) == (gm.getPlayerIndex(playerId)));
    return canBuild;
}