public int findOptimalSize(int size) {
    int currentSize = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < (freeSpaceTable.size()); i++) {
        if ((freeSpaceTable.get(i).size) >= size) {
            if ((freeSpaceTable.get(i).size) < currentSize) {
                currentSize = freeSpaceTable.get(i).size;
            }
        }
    }
    return currentSize;
}