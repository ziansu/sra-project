public static engine.gameData.GameTile getTile(int id) {
    if (id >= (engine.gameData.TileData.tiles.size()))
        id = 0;
    
    return engine.gameData.TileData.tiles.get(id);
}