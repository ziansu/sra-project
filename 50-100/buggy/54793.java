private void deleteTrash() {
    projectileHandler.deleteDestroyedBullets();
    java.util.Iterator<org.academiadecodigo.spaceimpact.gameobjects.spaceships.EnemyShip> it = enemyList.iterator();
    while (it.hasNext()) {
        org.academiadecodigo.spaceimpact.gameobjects.spaceships.EnemyShip enemyShip = it.next();
        if ((enemyShip.getLives()) == 0) {
            (destroyedEnemies)++;
        }
        if (enemyShip.isDestroyed()) {
            it.remove();
        }
    } 
}