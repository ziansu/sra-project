public double ytFunctionHeartRate(double x0) {
    double result;
    result = 1.0 / (1 + (java.lang.Math.exp(((-(fFunction(x0))) * (((t0Function(x0)) + (1.0 / 17)) - ((1.0 * (120 - x0)) / 2))))));
    return result;
}