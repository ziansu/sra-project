private void deleteTrash() {
    projectileHandler.deleteDestroyedBullets();
    java.util.Iterator<org.academiadecodigo.spaceimpact.gameobjects.spaceships.EnemyShip> it = enemyList.iterator();
    while (it.hasNext()) {
        org.academiadecodigo.spaceimpact.gameobjects.spaceships.EnemyShip enemyShip = it.next();
        if (enemyShip.isDestroyed()) {
            (destroyedEnemies)++;
            it.remove();
        }
    } 
}