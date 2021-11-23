public void move() {
    for (int i = 0; i < (enemyShips.size()); i++) {
        enemyShips.get(i).move();
        enemyShips.get(i).shoot();
    }
    for (int i = 0; i < (projectiles.size()); i++) {
        projectiles.get(i).move();
    }
    playerShip.move();
}