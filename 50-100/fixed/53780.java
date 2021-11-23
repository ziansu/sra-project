public void mouseDragged(java.awt.event.MouseEvent e) {
    if ((selected) != null) {
        int x = e.getX();
        int y = e.getY();
        selected.getModel().setX(x);
        selected.getModel().setY(y);
        repaint();
    }
}