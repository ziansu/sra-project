private double[] getIntervalsFromNumBins(java.lang.String colName, int numBins) throws io.ddf.exception.DDFException {
    io.ddf.DDF ddf = this.getDDF();
    double[] minMax = new double[]{ ddf.getVectorMin(colName) , ddf.getVectorMax(colName) };
    double min = minMax[0];
    double max = minMax[1];
    if (min == max) {
        min -= 0.001 * min;
        max += 0.001 * max;
    }
    return getBins(min, max, numBins);
}