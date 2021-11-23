public void DrawBoard(java.awt.Graphics g) {
    for (int r = 0; r < (board.length); r++) {
        for (int c = 0; c < (board[r].length); c++) {
            board[r][c].draw(g);
        }
    }
}