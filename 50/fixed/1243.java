private void generateTiles() {
    for (int i = 0; i < (Board.NUM_OF_TILES); i++) {
        this.tiles[i] = new Tile(i, this);
    }
}