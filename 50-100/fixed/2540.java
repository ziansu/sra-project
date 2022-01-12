public boolean isFull(int row, int col) {
    checkArgs(row, col);
    if (!(isOpen(row, col))) {
        return false;
    }
    return info.connected(((((row - 1) * (count)) + col) - 1), ((count) * (count)));
}