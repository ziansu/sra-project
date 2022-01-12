@java.lang.Override
public float getScaleFactor(int sourceWidth, int sourceHeight, int requestedWidth, int requestedHeight) {
    int minIntegerFactor = java.lang.Math.min((sourceHeight / requestedHeight), (sourceWidth / requestedWidth));
    return minIntegerFactor == 0 ? 1 : java.lang.Integer.highestOneBit(minIntegerFactor);
}