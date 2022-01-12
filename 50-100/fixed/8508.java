public static void drawString(java.awt.Graphics g, int x, int y, java.awt.Font font, java.awt.Color color, java.lang.String... strings) {
    if (font != null)
        g.setFont(font);
    
    if (color != null)
        g.setColor(color);
    
    sokoban.game.utils.TextDrawer.drawString(g, x, y, strings);
}