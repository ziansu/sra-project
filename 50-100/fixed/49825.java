private void enemyLogic(org.academiadecodigo.bootcamp.spaceimpact.Enemy[] enemies) {
    for (org.academiadecodigo.bootcamp.spaceimpact.Enemy enemy : enemies) {
        if (enemy != null) {
            if (!(enemy.isDestroyed())) {
                ((org.academiadecodigo.bootcamp.spaceimpact.SimpleGfxEnemy) (enemy.getRepresentation())).playAnimation();
                enemy.updatePattern(enemy);
                if ((enemy.getHitPoints()) <= 0) {
                    enemy.destroy();
                }
            }
        }
    }
}