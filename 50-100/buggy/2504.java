private double coverageConstraint() {
    double coverPercentage = getCoverPercentage();
    if (((MIN_COVER_PERCENTAGE) < coverPercentage) && (coverPercentage < (MAX_COVER_PERCENTAGE))) {
        return 1.0;
    }
    if ((MAX_COVER_PERCENTAGE) < coverPercentage) {
        return 1 - (java.lang.Math.sqrt((coverPercentage - (MAX_COVER_PERCENTAGE))));
    }
    return 0.0;
}