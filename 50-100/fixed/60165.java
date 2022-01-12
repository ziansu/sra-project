public int checkForLargestArmy() {
    int playerIndex = 0;
    for (shared.models.playerClasses.Player p : players) {
        if (((p.getArmy()) > (largestArmy)) && ((p.getArmy()) > 2)) {
            largestArmy = p.getArmy();
            return playerIndex;
        }
        playerIndex++;
    }
    return -1;
}