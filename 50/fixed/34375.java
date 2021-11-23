public double getError(int len) {
    double err = java.lang.Math.sqrt(((globalError) / (len * (outputCnt))));
    globalError = 0;
    return err;
}