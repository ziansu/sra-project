private java.lang.String diagonalSymbol() {
    if (diagonalsThreeInRow()) {
        return grid[0][0];
    }
    return "";
}