public void pushDown(int j) {
    for (int i = 0; i < (board.length); i++) {
        for (int h = j; 1 <= h; h--) {
            board[i][h] = board[i][(h - 1)];
        }
    }
}