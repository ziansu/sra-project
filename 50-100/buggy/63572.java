public boolean isSpelKlaar() {
    mazegame.Field veld = spelerVeld;
    if ((veld.getGameItem("Vriend")) == null) {
        return false;
    }
    java.lang.System.out.println("Level completed");
    mazegame.MazeGame.newLevel();
    speler.getVeld().removeGameItem("Speler1");
    return true;
}