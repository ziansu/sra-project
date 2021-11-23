private double stdDev(java.util.ArrayList<java.lang.Double> array) {
    double mean = mean(array);
    double sumOfDiffToMeanSq = 0;
    double length = array.size();
    for (double i : array) {
        double diffToMeanSq = java.lang.Math.pow((i - mean), 2);
        sumOfDiffToMeanSq += diffToMeanSq;
    }
    double meanOfDiffs = sumOfDiffToMeanSq / length;
    return java.lang.Math.sqrt(meanOfDiffs);
}