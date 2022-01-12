private int getTolerance(int freq, int range) {
    if (freq < (trustedFrequency)) {
        final double trustRate = ((double) (freq)) / ((double) (trustedFrequency));
        return ((int) (java.lang.Math.rint(((range * (rangeRatio)) * (1.0 - trustRate)))));
    }else {
        return 0;
    }
}