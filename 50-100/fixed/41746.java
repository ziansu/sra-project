public boolean overhangs(int cornerX, int cornerY) {
    return (((cornerX >= (x)) && (cornerX < ((x) + (32 * (tileSize))))) && (cornerY >= (y))) && (cornerY < ((y) + (32 * (tileSize))));
}