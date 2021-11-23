private int getImageWidth(int index) {
    int result = 0;
    if (hasColumnImages(index)) {
        result = getItemImageSize().x;
        int availableWidth = getCellWidth(index);
        if (!(isTreeColumn(index))) {
            result -= getCellPadding().x;
        }
        availableWidth = java.lang.Math.max(0, availableWidth);
        result = java.lang.Math.min(result, availableWidth);
    }
    return result;
}