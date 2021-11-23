public static final int getPositionInLine(final java.lang.String text, final int offset) {
    int columnCounter = 0;
    for (int i = offset - 1; i > 0; i--) {
        if ('\n' == (text.charAt(i))) {
            return columnCounter;
        }
        columnCounter++;
    }
    return columnCounter;
}