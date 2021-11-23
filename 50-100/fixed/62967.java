private int getImageWidth(int index) {
    if (hasColumnImages(index)) {
        int availableWidth = getCellWidth(index);
        if (!(isTreeColumn(index))) {
            availableWidth -= getCellPadding().x;
        }
        availableWidth = java.lang.Math.max(0, availableWidth);
        return java.lang.Math.min(getItemImageSize().x, availableWidth);
    }
    return 0;
}