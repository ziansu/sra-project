private boolean isHole(int i, int j, int[][] field) {
    if ((field[i][j]) != 0) {
        return false;
    }
    int cur_row = i + 1;
    while (cur_row < (PlayerSkeleton.ROWS)) {
        if ((field[cur_row][j]) != 0) {
            return true;
        }
        cur_row += 1;
    } 
    return false;
}