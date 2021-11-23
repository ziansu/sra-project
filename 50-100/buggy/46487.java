public void draw(java.awt.Graphics g) {
    if (fruitEditor.isPanelActive()) {
        g.setColor(java.awt.Color.WHITE);
        viewport.setBackground(g.getColor());
        map.draw(g);
        if (grid) {
            drawGrid(g);
        }
        drawCursor(g);
    }else {
        g.setColor(java.awt.Color.GRAY);
        viewport.setBackground(g.getColor());
    }
}