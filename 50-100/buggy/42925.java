public boolean killDragon(int x, int y) {
    for (gamepiece.gamePiece pieceToCheck : teamTwo) {
        if (pieceToCheck.checkPosition(new cmpt317A2.Tuple(x, y))) {
            pieceToCheck.kill();
            teamTwo.remove(pieceToCheck);
            return true;
        }
    }
    return false;
}