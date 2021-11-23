@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    origin = e.getPoint();
    corner = new java.awt.Point(((e.getX()) + 1), ((e.getY()) + 1));
}