public void clearRow(int row) {
    if ((row < 0) || (row >= (height))) {
        throw new java.lang.IllegalArgumentException("Invalid row dimension!");
    }else {
        for (int column = 0; column < (width); column++) {
            puzzle[row][column] = Puzzle.Colors.VOID;
        }
    }
}