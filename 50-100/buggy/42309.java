public void render() {
    world.renderBackground();
    synchronized(playerLock) {
        for (org.projectcrawwl.data.BasePlayer a : allPlayers) {
            a.render();
        }
    }
    synchronized(projectileLock) {
        for (org.projectcrawwl.projectile.BaseProjectile q : allProjectiles) {
            q.render();
        }
        for (org.projectcrawwl.data.GameObject c : corpses) {
            c.render();
        }
    }
    synchronized(playerLock) {
        if ((player) != null) {
            player.render();
            player.renderHUD();
        }
    }
}