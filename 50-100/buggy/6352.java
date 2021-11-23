public boolean free(float x, float y) {
    return (valid(x, y)) && (map[((int) (x / (tileSize)))][((int) (y / (tileSize)))]);
}