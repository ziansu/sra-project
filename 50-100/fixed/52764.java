public Model.Map.Tile.Tile getTopTile(int x, int y) {
    if ((((x < 0) || (y < 0)) || (x >= (maxColumn))) || (y >= (maxRow))) {
        return null;
    }else {
        return mapOfTiles[x][y].getTopTile();
    }
}