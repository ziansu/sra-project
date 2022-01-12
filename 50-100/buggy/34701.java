private void generate() {
    for (int r = 0; r < (board.getRows()); ++r) {
        for (int c = 0; c < (board.getCols()); ++c) {
            schmoller.hitori.Board.BoardNumber number = board.get(r, c);
            javafx.scene.layout.Region region = createItem(number);
            numberMap.put(number, region);
            add(region, r, c);
        }
    }
}