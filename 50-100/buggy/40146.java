public void init() {
    player = new GameObjects.Player();
    com.badlogic.gdx.math.Vector2[] points = getPointsFromFile("pointsTest.txt");
    Patterns.Pattern pattern = Patterns.TiledPatternParser.getPatternFromTMXFile("path.tmx");
    com.badlogic.gdx.utils.Json json = new com.badlogic.gdx.utils.Json();
    enemies = new GameObjects.Enemy[5];
    for (int i = 0; i < (enemies.length); i++) {
        enemies[i] = new GameObjects.Enemy(((i + 1) * 60), "enemy.png", pattern);
    }
}