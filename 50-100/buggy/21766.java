public int findFreeSpace(int size) {
    int index = -1;
    int currentSize = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < (freeSpaceTable.size); i++) {
        if ((freeSpaceTable[i]) >= size) {
            if ((freeSpaceTable[i]) < currentSize) {
                currentSize = freeSpaceTable;
                index = i;
            }
        }
    }
    return index;
}