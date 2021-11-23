public static main.game.terrain.tile.Tile getTileFromId(short id) {
    if ((main.game.terrain.Tiles.tiles[id]) != null)
        return main.game.terrain.Tiles.tiles[id];
    else
        return main.game.terrain.Tiles.tiles[0];
    
}