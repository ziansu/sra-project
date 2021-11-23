private int computeColumnCount(int maxWidth) {
    int numColumns = 0;
    while ((((numColumns + 1) * (mColorItemDimension)) + (((numColumns + 1) * 2) * (mColorItemMargin))) <= maxWidth) {
        numColumns++;
    } 
    return numColumns;
}