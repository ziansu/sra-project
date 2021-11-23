public org.jfree.data.xy.XYSeries calculate(double y, double h) {
    final java.lang.String title = java.text.MessageFormat.format("Runge (x = {0}, y = {1}, h = {2})", start, y, h);
    final org.jfree.data.xy.XYSeries series = new org.jfree.data.xy.XYSeries(title);
    series.add(start, y);
    for (double x = (start) + h; x <= (end); x += h) {
        y += T3(x, y, h);
        series.add(x, y);
    }
    return series;
}