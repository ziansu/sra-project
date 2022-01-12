public int getColumnAtOffset(int offset) {
    int relativeOffset = offset % (this.lineLength);
    int currentColumnLength = 0;
    for (int i = 0; i < (this.columnLengths.length); i++) {
        currentColumnLength += this.columnLengths[i];
        if (relativeOffset < currentColumnLength) {
            return i;
        }
    }
    return java.lang.Math.max(0, ((this.columnLengths.length) - 1));
}