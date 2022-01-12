public boolean smartShoot(int x, int y) {
    grid[x][y].setShot(true);
    (shotCount)++;
    if (grid[x][y].getBoat()) {
        (hitCount)++;
        if (!(getBoatSunk())) {
            hits.push(new battleship.service.Coordinate(x, y));
            new battleship.service.Coordinate(x, y).printCoordinate();
        }
        return true;
    }
    return false;
}