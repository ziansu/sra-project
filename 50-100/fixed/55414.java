private void tick() {
    handler.tick();
    hud.tick();
    if (((hud.getLevel()) > 10) && (!(spawned))) {
        handler.clearEnemies();
        handler.setBoss(new Boss(handler));
        spawned = true;
    }
}