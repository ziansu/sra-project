public final double nextDouble(final double min, final double max) {
    final double range = max - min;
    return (range * (java.lang.Math.random())) + min;
}