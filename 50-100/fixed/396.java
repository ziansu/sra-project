public void paint(java.awt.Graphics g) {
    java.awt.Color c = java.awt.Color.MAGENTA;
    for (estimatingpi.EstimatingPi.Point pt : pts) {
        if (pt.inside) {
            c = java.awt.Color.BLUE;
        }
        g.setColor(c);
        int x = ((int) (java.lang.Math.round(pt.xp))) + 360;
        int y = ((int) (java.lang.Math.round(pt.yp))) + 360;
        g.drawOval(x, y, 1, 1);
    }
}