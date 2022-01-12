public void removeFull() {
    int mask;
    boolean rowFull;
    for (int i = 0; i < (height); i++) {
        mask = 1 << i;
        rowFull = true;
        for (int col : columns) {
            if ((col & mask) != mask) {
                rowFull = false;
                break;
            }
        }
        if (rowFull) {
            removeRow(i);
        }
    }
}