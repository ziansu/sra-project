public org.jfree.data.xy.XYSeries calculate(double y, double h) {
    final java.lang.String title = java.text.MessageFormat.format("Runge (x = {0}, y = {1}, h = {2})", start, y, h);
    final org.jfree.data.xy.XYSeries series = new org.jfree.data.xy.XYSeries(title);
    for (double x = start; x < (end); x += h) {
        series.add(x, y);
        y += T3(x, y, h);
    }
    return series;
}