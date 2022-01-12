private void setPlayerSpawn(game.sprites.Sprite sprite) {
    boolean adjustX = true;
    int offset = game.world.Tile.TILE_SIZE;
    java.awt.Point p = players.getCenter();
    if (p == null)
        p = center;
    
    sprite.setPosition(p.x, p.y);
    while (isSpawnColliding(sprite)) {
        if (adjustX) {
            p.x += offset;
        }else {
            p.y += offset;
        }
        adjustX = !adjustX;
        sprite.setPosition(p.x, p.y);
    } 
}