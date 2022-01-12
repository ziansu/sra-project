public static <I1, I2, O> boolean compatible(final net.imglib2.IterableInterval<I1> a, final net.imglib2.IterableInterval<I2> b, final net.imglib2.RandomAccessibleInterval<O> c) {
    return (a.iterationOrder().equals(b.iterationOrder())) && (net.imglib2.util.Intervals.equalDimensions(a, c));
}