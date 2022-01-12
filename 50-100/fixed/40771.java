public boolean isFull(int row, int col) {
    if ((((row < 0) || (row >= (dim))) || (col < 0)) || (col >= (dim)))
        return false;
    
    return (isOpen(row, col)) && (UF.connected(0, (-1), row, col, false));
}