public void mousePressed(java.awt.event.MouseEvent me) {
    int x = me.getX();
    int y = me.getY();
    if ((originPoint) == null) {
        originPoint = new java.awt.Point(x, y);
    }else {
        java.awt.Point destination = new java.awt.Point(x, y);
        originPoint = destination;
        repaint();
    }
}