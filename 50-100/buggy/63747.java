private void setPlayerSpawn(game.sprites.Sprite sprite) {
    boolean adjustX = true;
    int offset = game.world.Tile.TILE_SIZE;
    java.awt.Point p = players.getCenter();
    if (p == null)
        p = center;
    
    do {
        sprite.setPosition(p.x, p.y);
        if (adjustX) {
            p.x += offset;
        }else {
            p.y += offset;
        }
        adjustX = !adjustX;
    } while (isSpawnColliding(sprite) );
}