private void setLastIndex() {
    int index = ((ImageProcessing.TILES_ROW) * (ImageProcessing.TILES_COL)) - 1;
    while ((index >= 0) && (isNumber(ar[index]))) {
        index--;
    } 
    lastIndex = index;
}