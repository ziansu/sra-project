public double getWeightedFMeasure(double beta) {
    double precision = this.getPrecision();
    double recall = this.getRecall();
    return ((((beta * beta) + 1) * precision) * recall) / (((beta * beta) * precision) + recall);
}