private double getPercentError(double experimentalVal, double expectedVal) {
    return (java.lang.Math.abs((expectedVal - experimentalVal))) / expectedVal;
}