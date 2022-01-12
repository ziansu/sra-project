public void clearTile(int x, int y) {
    board[x][y].removeGoal();
    board[x][y].removeGamePiece();
    board[x][y] = null;
}