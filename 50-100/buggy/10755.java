private static java.util.List<Tile> createGameBoard(Board.Builder builder) {
    java.util.List<Tile> tiles = new java.util.ArrayList<>();
    for (int i = 0; i <= (BoardUtils.NUM_TILES); i++) {
        tiles.add(Tile.createTile(i, builder.boardConfig.get(i)));
    }
    return tiles;
}