@java.lang.Override
public void draw(java.awt.Graphics2D screen, java.util.Vector target, java.awt.Dimension tileSize, double screenWidth, double screenHeight) {
    drawObject(screen, target, tileSize, screenWidth, screenHeight);
    drawBars(screen, target, tileSize, screenWidth, screenHeight);
    drawArmor(screen, target, tileSize, screenWidth, screenHeight);
}