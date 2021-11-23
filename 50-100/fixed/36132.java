public void createEnemies() {
    java.util.Random rand = new java.util.Random();
    enemies = new java.util.ArrayList<com.smiley.game.dungeoncrawler.Enemy>();
    for (int i = 0; i < 20; i++) {
        int ex = rand.nextInt(10);
        int ey = rand.nextInt(10);
        com.smiley.game.dungeoncrawler.Enemy enemy = new com.smiley.game.dungeoncrawler.Enemy("assets/EnemyExample.png");
        enemy.setPosition(ex, ey);
        enemy.moveSpeed = 20;
        enemies.add(enemy);
    }
}