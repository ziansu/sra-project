public static void updateEnemies() {
    for (int j = 0; j < (com.test.platformerse1.EnemyController.enemies.size()); ++j) {
        com.test.platformerse1.Enemy enemy = com.test.platformerse1.EnemyController.enemies.get(j);
        com.test.platformerse1.EnemyController.detectEnemyCollision(enemy);
        com.test.platformerse1.EnemyController.moveEnemy(enemy);
        com.test.platformerse1.EnemyController.runAI(enemy);
    }
}