public byte getColumn(int col) {
    int value = 0;
    for (int i = 0; i < (colCount); i++) {
        value |= patterns.get(i).getPattern()[col];
    }
    return ((byte) (value));
}