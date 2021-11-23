public com.thedude.rain.level.tile.Tile getTile(int x, int y) {
    if ((((x < 0) || (y < 0)) || (x > (width))) || (y > (height)))
        return com.thedude.rain.level.tile.Tile.voidTile;
    
    if ((tiles[(x + (y * (width)))]) == 0)
        return com.thedude.rain.level.tile.Tile.grass;
    
    return com.thedude.rain.level.tile.Tile.voidTile;
}