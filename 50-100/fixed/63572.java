public boolean isSpelKlaar() {
    mazegame.Field veld = spelerVeld;
    if ((veld.getGameItem("Vriend")) == null) {
        return false;
    }
    mazegame.MazeGame.newLevel();
    speler.getVeld().removeGameItem("Speler1");
    return true;
}