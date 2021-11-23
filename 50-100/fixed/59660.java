public int[][] ratkaiseSudoku(int[][] sudoku) {
    int limit = sudoku.length;
    boolean[][] valmiiksiannetut = syotettyjenLukujenTaulu(sudoku, limit);
    if (valmiiksiannetut == null) {
        return null;
    }
    if (!(sudokuPohjanTarkistus(sudoku, limit))) {
        return null;
    }
    int[][] ratkaisu = sudokunTaytto(sudoku, valmiiksiannetut, limit, 0, 0);
    return ratkaisu;
}