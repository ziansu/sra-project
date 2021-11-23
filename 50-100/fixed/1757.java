public void checkDeath() {
    boolean failed = false;
    for (int x = 0; x < (Draw.level[CURRENT_LEVEL].getNumEnemies()); x++) {
        if (Draw.level[CURRENT_LEVEL].getEnemy(x).checkPlayerCollision(Draw.level[CURRENT_LEVEL], Draw.player)) {
            failed = true;
        }
    }
    if (failed) {
        Draw.level[CURRENT_LEVEL].resetGoal();
        resetLevel();
    }else
        playerColor = java.awt.Color.LIGHT_GRAY;
    
    failed = false;
}