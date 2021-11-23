public float computeRowHeightInPoints(int fontSizeInPoints, int numLines) {
    float defaultRowHeightInPoints = sheet.getDefaultRowHeightInPoints();
    float lineHeightInPoints = 1.3F * fontSizeInPoints;
    if (lineHeightInPoints < (defaultRowHeightInPoints + 1)) {
        lineHeightInPoints = defaultRowHeightInPoints;
    }
    float rowHeightInPoints = lineHeightInPoints * numLines;
    rowHeightInPoints = (java.lang.Math.round((rowHeightInPoints * 4))) / 4.0F;
    return rowHeightInPoints;
}