public boolean placeFreeRoad(shared.locations.EdgeLocation edge) {
    int currentPlayer = game.getTurnTracker().getCurrentTurn();
    shared.data.Bank playerBank = resourceManager.getGameBanks().get(currentPlayer);
    if ((playerBank.getRoads()) > 0) {
        playerBank.removeRoad();
        locationManager.settleEdge(edge, currentPlayer);
        resourceManager.placedRoad(currentPlayer);
        saveResourcesIntoGame();
        return true;
    }else {
        return false;
    }
}