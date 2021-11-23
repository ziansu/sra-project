private void updateWithChanges(int startRow, int endRow) {
    updatePosition();
    updateOffsetOnCaret();
    if ((fileType) != (FileType.Text)) {
        if (startRow >= 0) {
            isShiftPressed = false;
            parser.parse(startRow, endRow);
        }
        parser.bracketLightOff();
        parser.bracketLight(column, row);
    }
    updateScrollBar();
}