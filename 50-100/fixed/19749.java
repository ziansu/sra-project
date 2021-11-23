public boolean isWall(int x, int y) {
    for (com.trisse.spacerouge.entities.tile.Tile t : tiles) {
        if (((t.x) == x) && ((t.y) == y)) {
            if (t.isWall()) {
                return true;
            }else {
                return false;
            }
        }
    }
    return false;
}