private int preProcessDataColPositionIndex(java.lang.String move) {
    int colPosition = -1;
    char colPositionChar = move.charAt(1);
    if ((move.length()) == 4) {
        if (charInRange(colPositionChar, 'a', 'h')) {
            colPosition = colPositionChar - 'a';
        }
    }
    return rowPosition;
}