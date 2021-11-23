public void render() {
    for (com.smiley.game.entity.Entity e : entities) {
        e.render();
    }
    for (com.smiley.game.entity.Enemy e : enemies) {
        if (((com.smiley.game.dungeoncrawler.GameScreen.frame) % (e.moveSpeed)) == 0) {
            e.chaseMob(player, entities);
        }
    }
    player.render();
}