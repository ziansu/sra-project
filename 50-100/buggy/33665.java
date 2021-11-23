public void setCell(int i, int j) {
    if ((board[i][j]) != null) {
        return ;
    }
    board[i][j] = (((current_player) % 2) == 0) ? "X" : "O";
    (current_player)++;
}