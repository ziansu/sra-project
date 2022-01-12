private void setupBoard() {
    for (int yRow = 1; yRow <= (length); ++yRow) {
        for (int xCol = 1; xCol <= (length); ++xCol) {
            org.javatuples.Pair<java.lang.Integer, java.lang.Integer> pair = org.javatuples.Pair.with(xCol, yRow);
            Tile tile = new Tile(this, pair);
            add(tile);
            slaves.add(tile);
        }
    }
}