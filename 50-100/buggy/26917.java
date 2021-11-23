private double getGrowthRate(double theTime) {
    double temperatureRange = (MAX_TEMPERATURE) - (MIN_TEMPERATURE);
    return ((MIN_TEMPERATURE) + (temperatureRange * 0.5F)) - ((temperatureRange * 0.5F) * (java.lang.Math.cos(((theTime * 2) * (java.lang.Math.PI)))));
}