protected void calcProbabilityAndError(int xSeparation, int ySeparation, float[] output) {
    int xSep0 = xSeparation / (scales[0]);
    int ySep0 = ySeparation / (scales[1]);
    int sep0 = ((int) (java.lang.Math.round(((xSep0 * xSep0) + (ySep0 * ySep0)))));
    calcProbabilityAndError(sep0, output);
}