static boolean gameWon() {
    noughtsandcrosses.VictoryConditions.refreshVcSets();
    boolean gameWon = false;
    for (java.util.List vcSet : noughtsandcrosses.VictoryConditions.victoryConditions.values()) {
        if (noughtsandcrosses.VictoryConditions.vcSetComplete(vcSet)) {
            gameWon = gameWon && (noughtsandcrosses.VictoryConditions.vcSetComplete(vcSet));
        }
    }
    if (gameWon) {
        java.lang.System.out.println("Game over!");
    }
    return gameWon;
}