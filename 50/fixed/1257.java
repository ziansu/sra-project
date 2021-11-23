public double getRecall() {
    return (truePositive) / ((double) ((truePositive) + (falseNegative)));
}