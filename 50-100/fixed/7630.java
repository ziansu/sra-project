private java.lang.Iterable<gameoflife.Cell> allCells() {
    java.util.List<gameoflife.Cell> allCells = new java.util.ArrayList<>();
    for (int y = 0; y < (matrix.getHeight()); y++) {
        for (int x = 0; x < (matrix.getWidth()); x++) {
            allCells.add(new gameoflife.Cell(y, x, (-1)));
        }
    }
    return allCells;
}