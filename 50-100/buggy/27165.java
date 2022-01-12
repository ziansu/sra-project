private void drawArmor(java.awt.Graphics2D screen, java.util.Vector target, java.awt.Dimension tileSize, int screenWidth, int screenHeight) {
    if ((armor.getToughness()) > 0) {
        armor.draw(screen, target, tileSize, screenWidth, screenHeight);
    }
}