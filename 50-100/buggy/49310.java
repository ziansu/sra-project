public boolean isOpen(int row, int col) {
    if ((((row < 1) || (row > (gridSize))) || (col < 1)) || (col > (gridSize)))
        throw new java.lang.IndexOutOfBoundsException();
    
    return sites[getSizeId(row, col)];
}