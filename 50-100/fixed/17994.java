@java.lang.Override
void draw(java.awt.Graphics2D g2) {
    synchronized(this) {
        g2.setColor(java.awt.Color.WHITE);
        g2.fillRect(xPos, yPos, width, height);
        g2.setColor(java.awt.Color.BLACK);
        g2.draw(new java.awt.geom.Rectangle2D.Double(xPos, yPos, width, height));
        int progressPixels = ((int) (((width) * (progress)) / 100.0));
        g2.fillRect(xPos, yPos, progressPixels, height);
    }
}