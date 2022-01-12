private static void renderText(final java.awt.Graphics g, final java.lang.String text, final int i) {
    final java.awt.FontMetrics metrics = g.getFontMetrics();
    int w = metrics.stringWidth(text);
    int h = metrics.getHeight();
    g.drawString(text, (698 - w), (698 - (h * i)));
}