public void render(minicraft.gfx.Screen screen, minicraft.level.Level level, int x, int y) {
    if (!(configured))
        update(screen, level, x, y, sparse.getColor(), sides.getColor(), full.getColor());
    
    current.render(screen, x, y);
}