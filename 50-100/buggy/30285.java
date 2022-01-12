public void drawEnemy(java.awt.Graphics g) {
    if ((isDead) == false) {
        drawEntity(g);
    }
    if (((isDead) == true) || ((isEnemyThrough) == true)) {
        xPos = 1200;
        yPos = 200;
        health = 100;
        width = 30;
        height = 30;
        speed = 3;
        drawEntity(g);
        isDead = false;
        isEnemyThrough = false;
    }
}