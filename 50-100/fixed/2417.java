public static java.lang.String toEng(final double value, final Utility.MetricPrefixes.RoundingMethods roundingMethod, final int roundTo) {
    final double abs = java.lang.Math.abs(value);
    double multiplier;
    for (final Utility.MetricPrefixes.MetricPrefixes e : Utility.MetricPrefixes.MetricPrefixes.values()) {
        multiplier = e.getMultiplier();
        if ((multiplier <= abs) && (abs < (multiplier * 1000)))
            return Utility.MetricPrefixes.MetricPrefixes.toEng(value, e, roundingMethod, roundTo);
        
    }
    return Utility.MetricPrefixes.MetricPrefixes.toSci(value);
}