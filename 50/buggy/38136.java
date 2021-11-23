protected int getState(final int row, final int col) {
    try {
        return _getState(row, col);
    } catch (java.lang.IndexOutOfBoundsException err) {
        return 0;
    }
}