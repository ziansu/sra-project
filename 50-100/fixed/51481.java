public void updateTempLegerLines(int pitch, int x, int staveLine, java.awt.Graphics g) {
    imp.gui.StaveActionHandler handler = getActionHandler();
    int oldx = handler.oldx;
    if ((java.lang.Math.abs((oldx - x))) > 2) {
        handler.oldx = x;
    }
    drawLegerLine(pitch, getActionHandler().oldx, staveLine, g);
}