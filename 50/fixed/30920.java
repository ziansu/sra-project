public crosstheborder.lib.Tile getTile(int x, int y) {
    try {
        return tiles[x][y];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    return null;
}