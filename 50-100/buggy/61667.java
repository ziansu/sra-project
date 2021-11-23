public static double adjustedrSquared(double rSquared, int numRegressors, int numDataPoints) {
    double divide = (numDataPoints - 1) / ((numDataPoints - numRegressors) - 1);
    double rSquaredDiff = 1 - rSquared;
    return 1 - (rSquaredDiff * divide);
}