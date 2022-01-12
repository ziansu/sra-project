private char retardedComputer() {
    int row;
    int column;
    do {
        row = rand.nextInt(getNumRows());
        column = rand.nextInt(getNumCols());
    } while ((gomokuBoard[row][column]) != (Square.EMPTY.toChar()) );
    gomokuBoard[row][column] = Square.CROSS.toChar();
    return gomokuBoard[row][column];
}