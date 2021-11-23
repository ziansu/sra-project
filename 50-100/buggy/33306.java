@java.lang.Override
void paint(java.awt.Graphics2D g, int x, int y, int width, int height) {
    myModified = false;
    if ((myStripe) != null) {
        int thickness = ((myAlignment) != null) ? (myMin) + (myGap) : height;
        y += getOffset(height, thickness);
        g.setColor(myStripe.getColor());
        g.fillRect(x, y, width, (thickness - (myGap)));
    }
}