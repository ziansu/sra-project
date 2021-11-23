public boolean inCheck(chess.Color current) {
    for (chess.Square enemy : enemies(current)) {
        for (chess.Square newEnemySpot : enemy.getPiece().getPossibleMoves()) {
            if (newEnemySpot.getPiece().getID().toLowerCase().equals("k")) {
                return true;
            }
        }
    }
    return false;
}