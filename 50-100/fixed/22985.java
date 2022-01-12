private int getNextChangingElement(final int a0, final boolean white) {
    int start = (white) ? 0 : 1;
    for (int i = start; i < (changesReferenceRowCount); i += 2) {
        if ((a0 < (changesReferenceRow[i])) || ((a0 == 0) && ((changesReferenceRow[i]) == 0))) {
            return i;
        }
    }
    return -1;
}