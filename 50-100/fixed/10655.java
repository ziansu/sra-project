@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    int x;
    int y;
    if ((drag) && (!(move))) {
        deselectAll();
        target.clear();
        x = e.getX();
        y = e.getY();
        for (main.GObject go : gObjects) {
            if (go.covered(eX, eY, x, y)) {
                target.add(go);
                go.selected();
            }
        }
        repaint();
    }
}