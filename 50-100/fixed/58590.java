public double computeFMeasure(int truePositive, int falsePositive, int falseNegative) {
    double precision = computePrecision(truePositive, falsePositive);
    double recall = computeRecall(truePositive, falseNegative);
    return ((((double) (2)) * precision) * recall) / (precision + recall);
}