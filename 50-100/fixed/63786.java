public void drawCells() {
    for (int y = 0; y < (rows); y++) {
        for (int x = 0; x < (cols); x++) {
            cells[x][y] = new levelBuilder.Cell();
            add(cells[x][y]);
        }
    }
}