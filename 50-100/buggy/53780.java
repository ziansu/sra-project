public void mouseDragged(java.awt.event.MouseEvent e) {
    if ((selected) != null) {
        int x = (e.getX()) - distX;
        int y = (e.getY()) - distY;
        selected.getModel().setX(x);
        selected.getModel().setY(y);
        repaint();
    }
}