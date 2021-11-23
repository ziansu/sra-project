public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
    java.awt.geom.Ellipse2D circle = new java.awt.geom.Ellipse2D.Double(this.x, this.y, 40, 40);
    g2.fill(circle);
    t.start();
}