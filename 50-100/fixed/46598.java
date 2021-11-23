protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if (draw) {
        java.lang.String s = java.lang.String.valueOf(time);
        g.setColor(java.awt.Color.red);
        g.drawString(s, x, y);
    }
}