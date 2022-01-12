public float computeRowHeightInPoints(int fontSizeInPoints, int numLines) {
    float lineHeightInPoints = 1.3F * fontSizeInPoints;
    float rowHeightInPoints = lineHeightInPoints * numLines;
    rowHeightInPoints = (java.lang.Math.round((rowHeightInPoints * 4))) / 4.0F;
    float defaultRowHeightInPoints = sheet.getDefaultRowHeightInPoints();
    if (rowHeightInPoints < (defaultRowHeightInPoints + 1)) {
        rowHeightInPoints = defaultRowHeightInPoints;
    }
    return rowHeightInPoints;
}