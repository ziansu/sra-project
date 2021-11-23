public boolean contains(java.lang.Integer number) {
    for (inlamningsuppgiftSudoku.SudokuNumber[] row : matrix) {
        for (inlamningsuppgiftSudoku.SudokuNumber col : row) {
            if ((inlamningsuppgiftSudoku.SudokuNumber.getValue()) == number) {
                return true;
            }
        }
    }
    return false;
}