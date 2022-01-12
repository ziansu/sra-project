private void initCells() {
    for (int i = 0; i < (mapSize); i++) {
        for (int j = 0; j < (mapSize); j++) {
            cells[i][j] = new api.Cell(j, i);
        }
    }
}