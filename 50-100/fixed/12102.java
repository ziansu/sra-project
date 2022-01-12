private void drawBins(java.awt.Graphics g) {
    g.setColor(java.awt.Color.GRAY);
    int x = LEFT_MARGIN;
    int y = (getHeight()) - (BOTTOM_MARGIN);
    for (int b : bins) {
        int height = ((int) (scaleY(b)));
        y -= height;
        g.fill3DRect(x, y, binWidth, height, true);
        x += binWidth;
        y = (getHeight()) - (BOTTOM_MARGIN);
    }
}