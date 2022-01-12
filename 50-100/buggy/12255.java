public void checkCollisions() {
    java.util.ArrayList<Game.Enemy> enemies = Game.StartMenu.getEnemyList();
    for (int i = 0; i < (enemies.size()); i++) {
        if (getBounds().intersects(enemies.get(i).getBounds())) {
            ey = 0;
            enemiesKilled += 1;
        }
    }
}