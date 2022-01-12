private static java.lang.String truncateFloat(float v) {
    int l = 1;
    if ((v > 10) || ((java.lang.Math.abs((v - (java.lang.Math.round(v))))) < 0.1)) {
        l = 0;
    }
    java.lang.String data = java.lang.String.format((("%." + l) + "f"), v);
    return data;
}