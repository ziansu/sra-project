public double getHypothesis(int pos) {
    double result = theta[0];
    for (int i = 0; i < (numberOfVariables); i++) {
        result += (theta[i]) * (trainingSet[pos][i]);
    }
    return result;
}