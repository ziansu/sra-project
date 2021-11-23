private void computeHigherSwingGradient(int stepIndex) {
    double duration = originalSwingDurations.get(stepIndex);
    double variation = (swingTwiddleSizeDuration) * duration;
    submitSwingTiming(stepIndex, (duration + variation), (-1.0));
    applyVariation(adjustedCoMPosition);
    computeGradient(predictedCoMPosition, adjustedCoMPosition, variation, tempGradient);
    higherSwingGradients.get((stepIndex - 1)).setByProjectionOntoXYPlane(tempGradient);
    submitSwingTiming(stepIndex, duration, (-1.0));
}