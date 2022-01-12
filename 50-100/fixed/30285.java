public void drawEnemy(java.awt.Graphics g) {
    drawEntity(g);
    if (((isDead) == true) || ((isEnemyThrough) == true)) {
        xPos = 1200;
        yPos = 200;
        health = 100;
        width = 30;
        height = 30;
        speed = 3;
        isDead = false;
        isEnemyThrough = false;
    }
}