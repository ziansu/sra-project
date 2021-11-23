private poker.Player getWinner() {
    if (checkGameOver()) {
        if ((joueur.getCoin()) <= 0) {
            return computer;
        }
        return joueur;
    }
    return null;
}