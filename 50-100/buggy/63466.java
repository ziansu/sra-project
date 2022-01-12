public boolean isBoardFull() {
    for (int i = 1; i < ((width) - 1); i++) {
        for (int j = 1; j < ((height) - 1); j++) {
            if ((board[i][j]) == 0) {
                return false;
            }
        }
    }
    return true;
}