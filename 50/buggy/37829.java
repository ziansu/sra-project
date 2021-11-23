private void drawValue(java.awt.Graphics g, int y, int x, java.lang.String memValueDisplay) {
    g.drawChars(memValueDisplay.toCharArray(), 0, memValueDisplay.length(), x, y);
}