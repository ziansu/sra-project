public int getUnfilled() {
    int count = 0;
    for (int i = 0; i < (board.length); i++) {
        for (int j = 0; j < (board[i].length); j++) {
            if ((board[i][j].getValue()) == null) {
                count++;
            }
        }
    }
    return count;
}