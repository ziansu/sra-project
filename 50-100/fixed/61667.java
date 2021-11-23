public static double adjustedrSquared(double rSquared, int numRegressors, int numDataPoints) {
    double divide = (numDataPoints - 1.0) / ((numDataPoints - numRegressors) - 1.0);
    double rSquaredDiff = 1 - rSquared;
    return 1 - (rSquaredDiff * divide);
}