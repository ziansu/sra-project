public void SpawnEnemys() {
    com.badlogic.gdx.math.Rectangle enemy = new com.badlogic.gdx.math.Rectangle();
    enemy.y = com.badlogic.gdx.math.MathUtils.random(0, (480 + 64));
    enemy.x = 800;
    enemy.width = 64;
    enemy.height = 64;
    enemys.add(enemy);
    lastEnemyTime = com.badlogic.gdx.utils.TimeUtils.nanoTime();
}