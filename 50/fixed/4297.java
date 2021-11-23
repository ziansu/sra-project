private java.awt.Point getPosition(int number) {
    int row = number / (size);
    int col = number % (size);
    return new java.awt.Point(col, row);
}