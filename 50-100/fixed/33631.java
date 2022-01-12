public void findAndSetNumMines(int w, int l) {
    int store;
    for (int y = 0; y < l; y++) {
        for (int x = 0; x < w; x++) {
            store = findNumMines(x, y);
            gridBlock[y][x].setNumMines(store);
        }
    }
}