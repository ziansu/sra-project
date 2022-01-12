private void drawSectorLines(java.awt.Graphics2D g2d) {
    for (int i = 0; i <= (numberOfSectors); i++) {
        g2d.setStroke(new java.awt.BasicStroke(1));
        g2d.setColor(java.awt.Color.WHITE);
        g2d.drawLine(0, 0, 0, (-500));
        g2d.rotate(java.lang.Math.toRadians(angle));
    }
}