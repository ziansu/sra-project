public double getWeightedFMeasure(double beta) {
    double precision = getPrecision();
    double recall = getRecall();
    return ((((beta * beta) + 1) * precision) * recall) / (((beta * beta) * precision) + recall);
}