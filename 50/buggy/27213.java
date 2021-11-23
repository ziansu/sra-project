@java.lang.Override
public java.lang.String toString() {
    return java.lang.String.format("PrimaryKeyStatistics{quantiles=%s}", nullCount, quantilesSketch.toString(true, false));
}