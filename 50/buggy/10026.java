public int getTileID(int x, int y, int layer) {
    if (isInBounds(x, y, layer))
        return com.kambius.darkrange.mapeditor.LevelMap.NONE_TILE;
    
    return mapArray[layer][y][x];
}