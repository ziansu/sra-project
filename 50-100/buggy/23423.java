public boolean canPlayerSelectDestinations(int playerID, int[] destinationsSelected) {
    if (!(playerManager.isPlayersTurn(playerID))) {
        return false;
    }
    if (((playerManager.getRoundNumber()) == 1) && ((destinationsSelected.length) < 2)) {
        return false;
    }
    return playerManager.canSelectDestinations(playerID, destinationsSelected);
}