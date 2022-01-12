private int rotatePlayerIndex(int currIndex, boolean mustBeActive) {
    int newIndex = incrementCounterModPlayers(currIndex);
    edu.jhu.clueless.Player nextPlayer = players.get(edu.jhu.clueless.Game.SUSPECT_ORDER[newIndex]);
    while ((nextPlayer == null) || (mustBeActive && (!(nextPlayer.isActive())))) {
        newIndex = incrementCounterModPlayers(newIndex);
        nextPlayer = players.get(edu.jhu.clueless.Game.SUSPECT_ORDER[newIndex]);
    } 
    return newIndex;
}