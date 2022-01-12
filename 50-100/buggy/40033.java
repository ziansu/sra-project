private void draw(java.awt.Graphics g, long time) {
    g.setColor(java.awt.Color.RED);
    g.fillOval(((int) (x)), ((int) (y)), 20, 20);
    g.setColor(java.awt.Color.BLACK);
    g.drawOval(((int) (x)), ((int) (y)), 20, 20);
    if ((time % (speed)) == 0)
        move();
    
}