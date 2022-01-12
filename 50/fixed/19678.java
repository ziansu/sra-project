public static com.reis.game_v3.screen.Tile initTile(com.reis.game_v3.screen.Tile[][] map, int row, int col) {
    com.reis.game_v3.screen.Tile t = new com.reis.game_v3.screen.Tile(row, col);
    map[row][col] = t;
    return t;
}