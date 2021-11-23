public int setPrecipChance(double precipChance) {
    double precipPercentage = (mPrecipChance) * 100;
    return ((int) (java.lang.Math.round(precipPercentage)));
}