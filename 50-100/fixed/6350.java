public void control(float deltaTime, com.badlogic.gdx.utils.Array<com.lothbrok.game.model.entities.Enemy> enemies, com.lothbrok.game.model.entities.Player player) {
    for (int i = 0; i < (enemies.size); i++) {
        controlEnemy(enemies.get(i), deltaTime, player);
    }
}