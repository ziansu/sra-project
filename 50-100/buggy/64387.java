public boolean isInBounds(int x, int y, int layer) {
    return (((((x < 0) || (x >= (mapWidth))) || (y < 0)) || (y >= (mapHeight))) || (layer < 0)) || (layer >= (mapDepth));
}