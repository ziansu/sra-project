public int[][] ratkaiseSudoku(int[][] sudoku) {
    int limit = sudoku.length;
    if (!(sudokuPohjanTarkistus(sudoku, limit))) {
        return null;
    }
    boolean[][] valmiiksiannetut = syotettyjenLukujenTaulu(sudoku, limit);
    if (valmiiksiannetut == null) {
        return null;
    }
    int[][] ratkaisu = sudokunTaytto(sudoku, valmiiksiannetut, limit, 0, 0);
    return ratkaisu;
}