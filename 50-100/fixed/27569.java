public void update() {
    removeAll();
    se.hig.aod.maze.models.TileModel[][] tiles = mazeModel.getTiles();
    for (int x = 0; x < (tiles.length); x++) {
        for (int y = 0; y < (tiles[x].length); y++) {
            add(tiles[y][x]);
        }
    }
    revalidate();
}