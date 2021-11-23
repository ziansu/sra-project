private static java.util.List<com.chess.engine.board.Tile> createGameBoard(final com.chess.engine.board.Board.Builder builder) {
    final com.chess.engine.board.Tile[] tiles = new com.chess.engine.board.Tile[BoardUtils.NUM_TILES];
    for (int i = 0; i < (BoardUtils.NUM_TILES); i++) {
        tiles[i] = com.chess.engine.board.Tile.createTile(i, builder.boardConfig.get(i));
    }
    return com.google.common.collect.ImmutableList.copyOf(tiles);
}