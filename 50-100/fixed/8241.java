public java.util.List<fr.iutvalence.info.dut.m2107.tiles.Tile> generateSurroundingTiles(java.util.List<fr.iutvalence.info.dut.m2107.tiles.Tile> globalTiles, fr.iutvalence.info.dut.m2107.entities.Collider col) {
    java.util.List<fr.iutvalence.info.dut.m2107.tiles.Tile> tiles = new java.util.ArrayList<fr.iutvalence.info.dut.m2107.tiles.Tile>();
    for (fr.iutvalence.info.dut.m2107.tiles.Tile tile : globalTiles)
        if (!(isColliding(col, tile)))
            tiles.add(tile);
        
    
    return tiles;
}