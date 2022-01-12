private void computeHigherTransferGradient(int stepIndex) {
    double originalDuration = originalTransferDurations.get(stepIndex);
    double variation = (-(transferTwiddleSizeDuration)) * originalDuration;
    submitTransferTiming(stepIndex, (originalDuration + variation), (-1.0));
    applyVariation(adjustedCoMPosition);
    computeGradient(predictedCoMPosition, adjustedCoMPosition, variation, tempGradient);
    higherTransferGradients.get((stepIndex - 2)).setByProjectionOntoXYPlane(tempGradient);
    submitTransferTiming(stepIndex, originalDuration, (-1.0));
}