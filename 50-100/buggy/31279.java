private int computeColumnCount(int maxWidth) {
    int numColumns = 0;
    while ((((numColumns + 1) * (mColorItemDimension)) + (((numColumns + 1) * 2) * (mColorItemMargin))) <= maxWidth) {
        numColumns++;
        int computedWidth = (numColumns * (mColorItemDimension)) + ((numColumns * (mColorItemMargin)) * 2);
        android.util.Log.d("colorpicker", ("computed width: " + computedWidth));
    } 
    return numColumns;
}