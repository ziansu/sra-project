public java.awt.Color getPixel(int column, int row, java.awt.Color emptyColor) {
    int i = getArrayIndex(column, row);
    if (i < 0) {
        return null;
    }
    return (this.imageData[i]) == null ? emptyColor : this.imageData[i];
}