public boolean getBlocked(int x, int y) {
    if ((((x > (Scenery.WIDTH)) || (y > (Scenery.HEIGHT))) || (x < 0)) || (y < 0)) {
        return false;
    }
    return this.isBlocked[x][y];
}