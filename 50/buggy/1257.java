public double getRecall() {
    return (this.truePositive) / ((double) ((this.truePositive) + (this.falseNegative)));
}