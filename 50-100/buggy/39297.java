public java.awt.Color getPixel(int column, int row, java.awt.Color emptyColor) {
    int i = getArrayIndex(column, row);
    java.awt.Color clr = ((this.imageData[i]) == null) ? emptyColor : this.imageData[i];
    return i >= 0 ? clr : null;
}