private void connectLeft(int i, int j) {
    if (j > 0) {
        int left = getPosition(i, (j - 1));
        if (isOpen(left)) {
            grid.union(left, getPosition(i, j));
        }
    }
}