private int startX(java.awt.Graphics g2d, java.lang.String s, int width) {
    int start = 0;
    if (s != null) {
        int stringLen = ((int) (g2d.getFontMetrics().getStringBounds(s, g2d).getWidth()));
        start = (width / 2) - (stringLen / 2);
    }
    return start;
}