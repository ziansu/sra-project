private boolean[][] copyAreSpaces() {
    boolean[][] b = new boolean[getMapTileWidth()][getMapTileHeight()];
    for (int i = 0; i < (b.length); i++)
        for (int j = 0; j < (b[i].length); j++)
            b[i][j] = areSpaces[i][j];
        
    
    return b;
}