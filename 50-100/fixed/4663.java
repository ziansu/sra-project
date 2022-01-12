private int rowColToIndex(int row, int col) {
    row = row - 1;
    int index = (row * (rows)) + col;
    if ((((((index > ((rows) * (rows))) || (index < 0)) || (row < 0)) || (row >= (rows))) || (col <= 0)) || (col > (rows)))
        throw new java.lang.IndexOutOfBoundsException();
    
    return index;
}