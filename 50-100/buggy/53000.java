public void init() {
    for (int row = 0; row < 6; row++) {
        for (int col = 0; col < 7; col++) {
            board[row][col] = 0;
        }
        top[row] = 0;
    }
    this.color = 1;
    this.move = 0;
}