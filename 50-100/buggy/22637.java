@java.lang.Override
public void movePiece(int x, int y, int finalX, int finalY) {
    it.mgd.checkers.model.Piece tmp = board[x][y].getPiece();
    tmp.setX(finalX);
    tmp.setY(finalY);
    board[finalX][finalY].occupy(tmp);
    board[x][y].free();
}