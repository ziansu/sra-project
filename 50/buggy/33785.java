public boolean nextHole() {
    int currentHole = dicegame.Game.holeIndex;
    int maxHole = dicegame.Game.holeCount;
    boolean moveSuccessful = false;
    if (currentHole < maxHole) {
        currentHole++;
        moveSuccessful = true;
    }
    dicegame.Game.holeIndex = currentHole;
    return moveSuccessful;
}