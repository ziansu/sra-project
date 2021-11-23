private void connectRight(int i, int j) {
    if (j < (n)) {
        int right = getPosition(i, (j + 1));
        if (isOpen(right)) {
            grid.union(right, getPosition(i, j));
        }
    }
}