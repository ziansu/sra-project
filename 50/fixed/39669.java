private int getAbsolutePosition(int basePosition, int layerDiff, int relativePosition) {
    while (layerDiff > 0) {
        basePosition = runtimeStack[(basePosition + 1)];
        layerDiff--;
    } 
    return basePosition + relativePosition;
}