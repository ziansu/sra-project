private void checkHit() {
    for (pixelWizard.Enemy enemy : enemies) {
        if (isEnemyInPlayerYRange(playerY, enemy)) {
            if ((isEnemyInPlayerXRange(playerX, enemy, facingForward)) && ((time0) != 0)) {
                enemy.takeDamage(mode);
            }else {
                if (enemy.getFacing()) {
                    enemy.setState(5);
                }else {
                    enemy.setState(3);
                }
            }
        }
    }
}