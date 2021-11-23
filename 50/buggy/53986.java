public static void update(int r, int c, char m) {
    TTTServer.board[r][c] = m;
    (TTTServer.moveCount)++;
}