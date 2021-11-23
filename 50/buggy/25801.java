private void setLastIndex() {
    int index = ((ImageProcessing.TILES_ROW) * (ImageProcessing.TILES_COL)) - 1;
    while (isNumber(ar[(index - 1)])) {
        index--;
    } 
    lastIndex = index;
}