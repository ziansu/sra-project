public boolean gameOver() {
    if (getBoard().canPickStone()) {
        return false;
    }
    for (qwirkle.Player p : players) {
        if ((p.getHandSize()) == 0) {
            return true;
        }
    }
    return false;
}