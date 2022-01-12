public synchronized void draw(java.awt.Graphics g) {
    if (isPanelActive()) {
        map.draw(g, ((int) (viewport.getViewPosition().getX())), ((int) (viewport.getViewPosition().getY())), viewport.getSize());
        if (grid) {
            drawGrid(g);
        }
        drawCursor(g);
    }
}