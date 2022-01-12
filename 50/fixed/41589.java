public static <I, O> boolean compatible(final net.imglib2.RandomAccessibleInterval<I> a, final net.imglib2.IterableInterval<O> b) {
    return net.imglib2.util.Intervals.contains(a, b);
}