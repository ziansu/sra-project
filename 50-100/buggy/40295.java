protected void calculateDimensions() {
    if (((numColumns) < 1) || ((numRows) < 1)) {
        return ;
    }
    cellWidth = (getWidth()) / (numColumns);
    cellHeight = (getHeight()) / (numRows);
    cellChecked = new boolean[numColumns][numRows];
    invalidate();
}