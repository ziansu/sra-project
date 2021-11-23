public int getPrecip() {
    double precipPercentage = (mPrecipitation) * 100;
    int value = ((int) (java.lang.Math.round(precipPercentage)));
    return value;
}