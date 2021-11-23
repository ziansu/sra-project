@java.lang.Override
public mindmelt.maps.TileType getTile(int x, int y, int level) {
    if ((x < 0) || (y < 0))
        return TileType.space;
    
    if ((x >= (mindmelt.maps.World.MAP_SIZE)) || (y >= (mindmelt.maps.World.MAP_SIZE)))
        return TileType.space;
    
    if ((map[level][y][x]) == null)
        return TileType.space;
    
    return map[level][y][x];
}