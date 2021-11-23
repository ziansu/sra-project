public void pushDown(int j) {
    for (int i = 0; i < (this.board.length); i++) {
        for (int h = j; 1 <= h; h--) {
            this.board[i][h] = this.board[i][(h - 1)];
        }
    }
}