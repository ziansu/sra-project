private int getTolerance(int freq, int range) {
    if (freq < (trustedFrequency)) {
        final double trustRate = ((double) (freq)) / ((double) (trustedFrequency));
        return ((int) (java.lang.Math.rint(((range * (rangeRatio)) * trustRate))));
    }else {
        return 0;
    }
}