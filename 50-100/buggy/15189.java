public void saveState() {
    revertScore = score;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            revertBoard[i][j] = board[i][j];
        }
    }
}