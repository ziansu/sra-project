public void open(int i, int j) {
    if (isInBounds(i, j)) {
        int rowIndex = i - 1;
        int colIndex = j - 1;
        if (!(isOpen(rowIndex, colIndex))) {
            int index = getIndex(rowIndex, colIndex);
            gridSites[index] = true;
            connectNeighbors(rowIndex, colIndex);
            (count)++;
        }
    }
}