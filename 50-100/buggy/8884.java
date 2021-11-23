public int xToPixel(double x, mesquite.lib.MesquiteChart chart) {
    tempNum.setValue(x);
    int fieldWidth = chart.getFieldWidth();
    int margin = chart.getMargin();
    return (margin + (tempNum.setWithinBounds(minX, maxX, ((fieldWidth - (2 * margin)) - (markerWidth))))) - (chart.getXPixelBase());
}