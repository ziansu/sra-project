public void executeTerritoryAddUnits(int playerID, int territoryID, int numUnits) {
    sg.com.yahoo.ryanlouck.orbital2015.Player currPlayer = playersMap.get(playerID);
    territoriesMap.get(territoryID).addUnits(numUnits);
    currPlayer.minusResources((numUnits * 10));
    currPlayer.minusNumTurns();
    if ((currPlayer.isTurnEnded()) & (playerID != 1)) {
        turnEnds();
    }
}