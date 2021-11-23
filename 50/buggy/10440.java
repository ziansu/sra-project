private java.awt.Color color(int col, int row) {
    while (discarded(col, row)) {
        col++;
    } 
    return picture.get(col, row);
}