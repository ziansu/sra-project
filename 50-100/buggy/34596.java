public void update(float delta) {
    timer += delta;
    if ((timer) > -1)
        timer = com.deeep.spaceglad.managers.EnemySpawner.spawnTimer;
    
    if (((timer) >= (com.deeep.spaceglad.managers.EnemySpawner.spawnTimer)) && (!(com.deeep.spaceglad.Settings.Paused))) {
        timer = 0;
        float x = (random.nextInt(80)) - 40;
        float z = (random.nextInt(80)) - 40;
        float y = 0;
        addEnemy(x, y, z);
    }
}