private void addNewLogicalTile() {
    int[][] emptyTiles = getEmptyTiles();
    if ((emptyTiles.length) > 0) {
        java.util.Random rand = new java.util.Random();
        int randNum = rand.nextInt(emptyTiles.length);
        int row = emptyTiles[randNum][0];
        int column = emptyTiles[randNum][1];
        Model.board[row][column] = newValue();
    }
}