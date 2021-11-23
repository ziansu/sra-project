public synchronized int yToPixel(double y, mesquite.lib.MesquiteChart chart) {
    tempNum.setValue(y);
    int fieldHeight = chart.getFieldHeight();
    int margin = chart.getMargin();
    int value = ((fieldHeight - margin) - (tempNum.setWithinBounds(minY, maxY, (fieldHeight - (2 * margin))))) - (chart.getYPixelBase());
    return value;
}