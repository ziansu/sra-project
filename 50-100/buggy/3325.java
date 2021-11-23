public byte getColumn(int col) {
    int value = 0;
    for (int i = 0; i < (colCount); i++) {
        value = value | (patterns.elementAt(i).getPattern()[col]);
    }
    return ((byte) (value));
}