public double ytFunctionRespirationRate(double x0) {
    double result = 1.0 / (1.0 + (java.lang.Math.exp(((-(fFunction(x0))) * (((t0Function(x0)) + (1.0 / 8)) - ((1.0 * (120 - x0)) / 2))))));
    return result;
}