public double subtractRange(final int firstIndex, final int secondIndex) {
    double result = systemCoefficients[firstIndex][secondIndex];
    for (int k = 0; k <= (secondIndex - 1); k++) {
        result -= (systemCoefficients[firstIndex][k]) * (systemCoefficients[secondIndex][k]);
    }
    return result;
}