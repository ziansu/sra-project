public void drawGrid(java.awt.Graphics g) {
    g.setColor(java.awt.Color.ORANGE);
    for (int i = 0; i < 13; i++) {
        g.drawLine(Gridx2Screenx(i), 0, Gridx2Screenx(i), GridHeight2ScreenHeight(GRIDH));
        g.drawLine(0, Gridy2Screeny(i), GridWidth2ScreenWidth(GRIDW), Gridy2Screeny(i));
    }
}