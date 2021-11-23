@java.lang.Override
public void move(java.awt.Graphics2D g2d) {
    determineDir();
    moveCheckBorders();
    moveCheckInnerWalls();
    g2d.drawImage(enemypic, enemyx, enemyy, blockSize, blockSize, null);
}