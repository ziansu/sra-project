public void resetLabyrinth() {
    for (int x = 0; x < (tiles.length); x++) {
        for (int y = 0; y < (tiles[x].length); y++) {
            se.hig.aod.maze.models.TileModel tileModel = new se.hig.aod.maze.models.TileModel(x, y, TileState.BLOCKED);
            tileModel.add(new javax.swing.JLabel(((x + ",") + y)));
            tiles[x][y] = tileModel;
        }
    }
    updateLabyrinth("update");
}