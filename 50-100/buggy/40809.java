private void draw() {
    g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setRenderingHint(java.awt.RenderingHints.KEY_TEXT_ANTIALIASING, java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    g2.setColor(new java.awt.Color(180, 180, 180));
    g2.fillRect(0, 0, getWidth(), getHeight());
    if (((sizeX) == 0) || ((sizeY) == 0)) {
        chosen.draw();
    }else {
        chosen.draw();
    }
    bs.show();
}