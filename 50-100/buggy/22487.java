private char retardedComputer() {
    int row = rand.nextInt(getNumRows());
    int column = rand.nextInt(getNumCols());
    while ((gomokuBoard[row][column]) == (Square.EMPTY.toChar()))
        gomokuBoard[row][column] = Square.CROSS.toChar();
    
    return gomokuBoard[row][column];
}