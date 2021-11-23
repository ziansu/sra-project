private void tick() {
    if ((com.game.src.main.Game.State) == (com.game.src.main.Game.STATE.GAME)) {
        p.tick();
        c.tick();
        if ((enemy_killed) >= (enemy_count)) {
            enemy_count += 2;
            enemy_killed = 0;
            c.createEnemy(enemy_count);
        }
    }
    if ((com.game.src.main.Game.HEALTH) <= 0) {
        com.game.src.main.Game.HEALTH = 100;
        com.game.src.main.Game.State = com.game.src.main.Game.STATE.MENU;
    }
}