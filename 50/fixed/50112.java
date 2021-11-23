private boolean isPercentageInfectedWithinTargetRange(float targetPercentage) {
    return (targetPercentage - (getTotalPercentageInfected())) < (delta);
}