private void move() {
    for (int i = 0; i < (enemyShips.size()); i++) {
        enemyShips.get(i).move();
        enemyShips.get(i).shoot();
    }
    playerShip.keyMapHandler();
    projectileHandler.moveProjectiles();
}