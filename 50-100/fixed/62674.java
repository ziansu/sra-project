public int getCurrentPlayer() {
    int pieces = 0;
    for (int[] col : gameBoard) {
        int row = 0;
        int field;
        while ((row < (col.length)) && ((field = col[row]) != 0)) {
            pieces += field;
            row++;
        } 
    }
    return pieces == 1 ? -1 : 1;
}