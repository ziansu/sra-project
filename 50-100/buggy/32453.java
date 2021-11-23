public void pass(java.awt.Graphics g) {
    if ((painted) < (gateDelay)) {
        g.setColor(java.awt.Color.green);
        g.fillRect((((center.getX()) - 20) + (10 * (painted))), ((center.getY()) - 5), 10, 10);
        (painted)++;
    }
}