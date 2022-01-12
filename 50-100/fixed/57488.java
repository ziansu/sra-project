@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    if ((target) != null) {
        int x = e.getX();
        int y = e.getY();
        target.move(x, y);
        repaint();
    }
}