private boolean validSite(int row, int col) {
    return (((row < 0) || (row > (n))) || (col < 0)) || (col > (n));
}