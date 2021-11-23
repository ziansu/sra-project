private boolean[][] copyAreSpaces() {
    boolean[][] b = new boolean[getMapTileWidth()][getMapTileHeight()];
    for (int i = 0; i < (getMapTileWidth()); i++)
        for (int j = 0; j < (getMapTileHeight()); j++)
            b[i][j] = areSpaces[i][j];
        
    
    return b;
}