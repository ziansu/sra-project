private static java.lang.String formatHighLows(double high, double low) {
    long roundedHigh = java.lang.Math.round(high);
    long roundedLow = java.lang.Math.round(low);
    java.lang.String highLowStr = (roundedHigh + "/") + roundedLow;
    return highLowStr;
}