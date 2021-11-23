private int getBucketIndex(double value) {
    if (((java.lang.Double.compare(value, minV)) < 0) || ((java.lang.Double.compare(value, maxV)) >= 0)) {
        return -1;
    }
    return ((int) (java.lang.Math.floor(((value - (minV)) / (step)))));
}