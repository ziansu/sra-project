public void init() {
    for (int col = 0; col < 7; ++col) {
        for (int row = 0; row < 6; ++row) {
            board[row][col] = 0;
        }
        top[col] = 0;
    }
    this.color = 1;
    this.move = 0;
}