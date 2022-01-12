@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paint(g);
    for (java.awt.Shape s : shapes) {
        bPaint.drawShape(s, g, false);
    }
}