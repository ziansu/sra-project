private boolean outOfBounds(int row, int col, State state) {
    java.lang.System.out.println(((((("row: " + row) + " col: ") + col) + " length: ") + (state.matrix.length)));
    return (((row < 0) || (col < 0)) || (row > (state.matrix.length))) || (col > (state.matrix[0].length));
}