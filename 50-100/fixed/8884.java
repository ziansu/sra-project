public synchronized int xToPixel(double x, mesquite.lib.MesquiteChart chart) {
    tempNum.setValue(x);
    int fieldWidth = chart.getFieldWidth();
    int margin = chart.getMargin();
    int value = (margin + (tempNum.setWithinBounds(minX, maxX, ((fieldWidth - (2 * margin)) - (markerWidth))))) - (chart.getXPixelBase());
    return value;
}