public void clear() {
    grid = new com.jdrago.sudoku.SudokuGame.Cell[9][9];
    for (int j = 0; j < 9; ++j) {
        for (int i = 0; i < 9; ++i) {
            clear(i, j);
        }
    }
}