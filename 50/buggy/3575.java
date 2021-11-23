public Personnage getTempPersoSelec() {
    if ((tempPersoSelectionne) != null) {
        return tempPersoSelectionne;
    }
    return new Personnage("pas de temp", true, 0, new Position((-1), (-1)), (-1));
}