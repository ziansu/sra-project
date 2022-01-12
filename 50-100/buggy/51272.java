@java.lang.Override
public void removeLastFromWindow() {
    macrobase.analysis.outlier.MovingAverage.DatumWithInfo head = window.remove();
    int oldWeight = head.getWeight();
    weightTotal -= oldWeight;
    windowSum = windowSum.subtract(head.getDatum().getMetrics().mapMultiply(oldWeight));
    window.remove();
}