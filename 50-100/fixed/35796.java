private double getLineWidth(int lineNumber) {
    double additionalFactor = getAdditionalWidthRatio(lineNumber);
    double betweenBiggestFactor = additionalFactor * (getBetweenBiggestWidthRatio(lineNumber));
    return (((minWidthRatio) + (additionalFactor * ((nRatio) - (minWidthRatio)))) + (betweenBiggestFactor * (1 - (nRatio)))) * (width);
}