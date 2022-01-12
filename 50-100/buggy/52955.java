public static void applyAcCoupling(double[] timeLine) {
    if ((timeLine.length) == 0)
        return ;
    
    double sum = 0.0;
    for (double slice : timeLine) {
        sum += slice;
    }
    final double mean = sum / ((double) (timeLine.length));
    timeLine = fact.features.singlePulse.timeLineExtraction.ElementWise.add(timeLine, (-mean));
}