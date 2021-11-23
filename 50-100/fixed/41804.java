private double marginal(int labelIndex) {
    double sum = 0;
    for (int k = 0; k < (numComponents); k++) {
        sum += (java.lang.Math.exp(logProportions[k])) * (java.lang.Math.exp(logClassProbs[k][labelIndex][1]));
    }
    return sum;
}