public void reset() {
    int k = 0;
    for (int i = 0; i < (size()); i++) {
        for (int j = 0; j < (size()); j++) {
            _puzzle[i][j] = k;
            k++;
        }
    }
    _emptyCellRow = 0;
    _emptyCellColumn = 0;
    _puzzle[_emptyCellRow][_emptyCellColumn] = 0;
}