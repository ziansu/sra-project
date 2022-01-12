protected static javafx.scene.chart.NumberAxis vecToAxis(java.lang.String name, jsat.linear.Vec xVals) {
    double min = xVals.min();
    double max = xVals.max();
    double range = max - min;
    min -= range * 0.05;
    max += range * 0.05;
    javafx.scene.chart.NumberAxis xAxis = (name == null) ? new javafx.scene.chart.NumberAxis(min, max, com.edwardraff.jsatfx.Plot.getTick(xVals)) : new javafx.scene.chart.NumberAxis(name.trim(), min, max, com.edwardraff.jsatfx.Plot.getTick(xVals));
    return xAxis;
}