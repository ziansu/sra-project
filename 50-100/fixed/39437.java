public void open(int i, int j) {
    if (isInBounds(i, j)) {
        if (!(isOpen(i, j))) {
            int index = getIndex(i, j);
            gridSites[index] = true;
            connectNeighbors(i, j);
            (count)++;
        }
    }
}