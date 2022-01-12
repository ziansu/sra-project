public void reset() {
    int k = 1;
    for (int i = 0; i < (size()); i++) {
        for (int j = 0; j < (size()); j++) {
            _puzzle[i][j] = k;
            k++;
        }
    }
    _emptyCellRow = (size()) - 1;
    _emptyCellColumn = (size()) - 1;
    _puzzle[_emptyCellRow][_emptyCellColumn] = 0;
}