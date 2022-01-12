private int validPosition(int x) {
    int temp = 0;
    if ((x >= 0) && (x < (column))) {
        for (int y = 0; y < (row); y++) {
            if ((field[x][y]) == 0) {
                return y;
            }else {
                temp = -1;
            }
        }
    }else {
        temp = -1;
    }
    return temp;
}