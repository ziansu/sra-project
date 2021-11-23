private void connectRight(int i, int j) {
    if (j < ((n) - 1)) {
        int right = getPosition(i, (j + 1));
        if (isOpen(right)) {
            grid.union(right, getPosition(i, j));
        }
    }
}