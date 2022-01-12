public void executeCurrentMove() {
    java.lang.System.out.println(this);
    board.getTile(destination).setPiece(board.getTile(pos).getPiece());
    board.getTile(pos).setPiece(null);
    board.getTile(destination).getPiece().setPos(destination);
}