private void drawArmor(java.awt.Graphics2D screen, java.util.Vector target, java.awt.Dimension tileSize, double screenWidth, double screenHeight) {
    if ((armor.getToughness()) > 0) {
        armor.draw(screen, target, tileSize, screenWidth, screenHeight);
    }
}