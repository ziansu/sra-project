public void divideRow(Matrix mx, int row1, double k) {
    if (k != 0) {
        for (int i = 0; i < (mx.getCol()); i++) {
            mx.setElement((row1 - 1), i, ((mx.getElement((row1 - 1), i)) / k));
        }
    }
}