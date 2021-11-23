private void renderAllCells(int ColumnsIndex, int RowsIndex) {
    int c = settings.getColumnsToRender();
    int r = settings.getRowsToRender();
    for (int i = 0; i <= c; i++) {
        for (int j = 0; j < r; j++) {
            int x = ColumnsIndex + i;
            int y = RowsIndex + j;
            insertSingleCell(i, y, x, j);
        }
    }
}