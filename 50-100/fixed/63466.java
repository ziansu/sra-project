public boolean isBoardFull() {
    for (int i = 0; i < (width); i++) {
        for (int j = 0; j < (height); j++) {
            if ((board[i][j]) == 0) {
                return false;
            }
        }
    }
    return true;
}