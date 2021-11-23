public void SpawnEnemys() {
    com.badlogic.gdx.math.Rectangle enemy = new com.badlogic.gdx.math.Rectangle();
    enemy.x = com.badlogic.gdx.math.MathUtils.random(0, (480 - 40));
    enemy.y = 800 - 64;
    enemy.width = 64;
    enemy.height = 64;
    enemys.add(enemy);
    lastEnemyTime = com.badlogic.gdx.utils.TimeUtils.nanoTime();
}