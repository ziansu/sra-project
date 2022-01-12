public void addNeutralLoss(java.lang.String neutralLossName, java.lang.Integer bStart, java.lang.Integer yStart) {
    backwardCompatibilityFix();
    java.lang.Integer position = forwardBoundaries.get(neutralLossName);
    if ((position == null) || (bStart < position)) {
        forwardBoundaries.put(neutralLossName, bStart);
    }
    position = rewindBoundaries.get(neutralLossName);
    if ((position == null) || (yStart < position)) {
        rewindBoundaries.put(neutralLossName, yStart);
    }
}