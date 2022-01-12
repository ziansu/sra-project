public int findOptimalSize(int size) {
    int currentSize = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < (freeSpaceTable.size); i++) {
        if ((freeSpaceTable[i]) >= size) {
            if ((freeSpaceTable[i]) < currentSize) {
                currentSize = freeSpaceTable;
            }
        }
    }
    return currentSize;
}