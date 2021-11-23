private boolean isPointedPairInRow(com.darringer.games.sudoku.SudokuModel model, int x, int y, int rowIndex, int number) {
    for (int i = 0; i < (SudokuModel.SIZE); i++) {
        if ((i < x) || (i > (x + 3))) {
            java.util.Set<java.lang.Integer> currentSet = model.getSet(i, (y + rowIndex));
            if (currentSet.contains(number)) {
                return true;
            }
        }
    }
    return false;
}