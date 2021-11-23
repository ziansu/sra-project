private void updateImage() {
    java.awt.Graphics2D g2 = bfImage.createGraphics();
    g2.setColor(activeColor);
    if ((newPoint) != null) {
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawLine(oldPoint.x, oldPoint.y, newPoint.x, newPoint.y);
        g2.dispose();
        repaint();
    }
}