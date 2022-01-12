private static java.util.List<Tile> createGameBoard(final Board.Builder builder) {
    final Tile[] tiles = new Tile[BoardUtils.NUM_TILES];
    for (int i = 0; i < (BoardUtils.NUM_TILES); i++) {
        tiles[i] = Tile.createTile(i, builder.boardConfig.get(i));
    }
    return java.util.Arrays.asList(tiles);
}