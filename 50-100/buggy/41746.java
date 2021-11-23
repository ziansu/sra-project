public boolean overhangs(int cornerX, int cornerY) {
    return (((cornerX >= (x)) && (cornerX < ((x) + ((32 * (com.evansitzes.game.Configuration.WIDTH_MODIFIER)) * (tileSize))))) && (cornerY >= (y))) && (cornerY < ((y) + ((32 * (com.evansitzes.game.Configuration.HEIGHT_MODIFIER)) * (tileSize))));
}