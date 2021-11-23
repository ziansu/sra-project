public boolean checkWinCol() {
    int count = 0;
    for (int j = 0; j < (Connect4.COLS); (i)++) {
        count = 0;
        for (int i = 0; i < (Connect4.ROWS); j++) {
            if ((board[i][j]) == (curPlayer)) {
                count++;
            }else {
                count = 0;
            }
            if (count >= 4) {
                return true;
            }
        }
    }
    return false;
}