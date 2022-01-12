public double subtractRange(final int firstIndex, final int secondIndex) {
    double result = systemCoefficients[firstIndex][secondIndex];
    for (int k = 0; k <= (secondIndex - 1); k++) {
        result -= (lMatrix[firstIndex][k]) * (lMatrix[secondIndex][k]);
    }
    return result;
}