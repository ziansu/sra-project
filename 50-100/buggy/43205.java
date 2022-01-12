private static java.lang.String truncateFloat(float v) {
    int l = 1;
    if ((v > 10) || ((v - (java.lang.Math.floor(v))) < 0.1)) {
        l = 0;
    }
    java.lang.String data = java.lang.String.format((("%." + l) + "f"), v);
    return data;
}