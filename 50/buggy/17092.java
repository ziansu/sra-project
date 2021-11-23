@java.lang.Override
public void capture(int x, int y) {
    board[x][y].getPiece();
    board[x][y].free();
}