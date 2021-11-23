private boolean outOfBounds(int row, int col, State state) {
    return (((row < 0) || (col < 0)) || (row > ((state.matrix.length) - 1))) || (col > ((state.matrix[0].length) - 1));
}