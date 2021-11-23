public synchronized void draw(java.awt.Graphics g) {
    if (fruitEditor.isPanelActive()) {
        g.setColor(java.awt.Color.WHITE);
        setBackground(g.getColor());
        map.draw(g);
        if (grid) {
            drawGrid(g);
        }
        drawCursor(g);
    }else {
        g.setColor(java.awt.Color.GRAY);
        setBackground(g.getColor());
    }
}