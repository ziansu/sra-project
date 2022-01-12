@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    if ((drag) && (!(move))) {
        deselectAll();
        target.clear();
        int x = e.getX();
        int y = e.getY();
        for (main.GObject go : gObjects) {
            if (go.covered(eX, eY, x, y)) {
                target.add(go);
                go.selected();
            }
        }
        repaint();
    }
}