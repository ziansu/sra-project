private boolean isValidCoordinate(int x, int y) {
    return !((((y < 0) || (y >= (mapHeight))) || (x < 0)) || (x >= (mapWidth)));
}