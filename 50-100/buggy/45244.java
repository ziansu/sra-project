public com.google.common.base.Optional<java.lang.Double> percentile(double p) {
    com.google.common.base.Preconditions.checkArgument(((p >= 0.0) && (p < 1.0)), "Percentiles must be in [0.0, 1.0)");
    if ((data.length) == 0) {
        return com.google.common.base.Optional.absent();
    }
    return com.google.common.base.Optional.of(this.algorithm.computePercentile(p, data));
}