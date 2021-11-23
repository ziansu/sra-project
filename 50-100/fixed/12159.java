public kiviuq.entities.TileType[][] convertGrid() {
    kiviuq.entities.TileType[][] newGrid;
    newGrid = new kiviuq.entities.TileType[9][9];
    for (int x = 0; x < 9; x++) {
        for (int y = 0; y < 9; y++) {
            kiviuq.entities.TileType type = grid[x][y].getType();
            newGrid[x][y] = type;
        }
    }
    return newGrid;
}