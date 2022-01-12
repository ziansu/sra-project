private void fillBoard() {
    int value = 0;
    for (int j = 0; j < 4; j++) {
        for (int i = 0; i < 4; i++) {
            tiles[i][j] = ++value;
        }
    }
    tiles[3][3] = 0;
}