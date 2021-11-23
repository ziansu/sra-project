private double stdDev(java.util.LinkedList<java.lang.Double> list) {
    double mean = mean(list);
    double sumOfDiffToMeanSq = 0;
    double length = list.size();
    for (double i : list) {
        double diffToMeanSq = java.lang.Math.pow((i - mean), 2);
        sumOfDiffToMeanSq += diffToMeanSq;
    }
    double meanOfDiffs = sumOfDiffToMeanSq / length;
    return java.lang.Math.sqrt(meanOfDiffs);
}