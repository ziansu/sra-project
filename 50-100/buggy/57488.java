@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    try {
        int x = e.getX();
        int y = e.getY();
        target.move(x, y);
        repaint();
    } catch (java.lang.Exception exception) {
    }
}