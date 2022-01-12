public boolean isOpen(int row, int col) {
    row -= 1;
    col -= 1;
    return isOpen[((row * (n)) + col)];
}