private double getMinFrequency() {
    double sMin = greyLevelMap.get(0);
    for (java.lang.Double i : greyLevelMap.values()) {
        if (i < sMin) {
            sMin = i;
        }
    }
    return sMin / (pixelCount);
}