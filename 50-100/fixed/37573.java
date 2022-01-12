public void update(float dt) {
    updateProjectiles(dt);
    handleProjectileCollision(dt);
    handleGameObjects();
    handleContactDamage(dt);
    proc.queryInput();
    player.update(dt);
    updateEnemies(dt);
    if ((enemies.isEmpty()) || (player.isDead())) {
    }
}