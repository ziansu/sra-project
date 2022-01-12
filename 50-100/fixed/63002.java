private int calculateKPoisson(double lambda) {
    final double threshold = 1.0 - (this.significanceLevel);
    final org.apache.commons.math3.distribution.PoissonDistribution distribution = new org.apache.commons.math3.distribution.PoissonDistribution(lambda);
    int counter = 0;
    double value = 0;
    while (value < threshold) {
        value = distribution.cumulativeProbability(counter);
        counter++;
        if (counter >= (this.k)) {
            value = 1.0;
            break;
        }
    } 
    this.type1Error = 1.0 - value;
    return counter + 1;
}