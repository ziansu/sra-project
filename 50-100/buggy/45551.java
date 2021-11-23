private boolean check(int player) {
    chessgame.Square king = cb.getKing(player);
    java.awt.Point p = king.getPoint();
    for (java.awt.Point move : playerMoves((1 - player))) {
        if (move.equals(p)) {
            return true;
        }
    }
    return false;
}