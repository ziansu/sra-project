public static woohoo.utils.gameobjects.Tile selectTile(int x, int y) {
    x /= Tile.G_TILE_WIDTH;
    y /= Tile.G_TILE_HEIGHT;
    int location = (y * (woohoo.utils.gameobjects.TileMap.mapWidth)) + x;
    woohoo.utils.gameobjects.Tile clicked = ((woohoo.utils.gameobjects.Tile) (woohoo.utils.gameobjects.TileMap.tileList.toArray()[location]));
    return clicked;
}