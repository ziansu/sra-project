private boolean isActionMoveVertical(float xDiff, float yDiff) {
    return (java.lang.Math.atan2(yDiff, xDiff)) > ((3 * (java.lang.Math.PI)) / 8);
}