public static long estimateSizeOnHeap(int numberOfPoints, int maxBitLength) {
    long[] yTotals = algorithms.YFastTrieLong.estimateSizeOnHeap(numberOfPoints, maxBitLength);
    java.lang.System.out.println(("yft estimates=" + (java.util.Arrays.toString(yTotals))));
    algorithms.util.ObjectSpaceEstimator est = new algorithms.util.ObjectSpaceEstimator();
    est.setNObjRefsFields(4);
    est.setNIntFields(2);
    est.setNLongFields(1);
    est.setNBooleanFields(1);
    long total = est.estimateSizeOnHeap();
    total += yTotals[1];
    return total;
}