private static void getDriftingPositions(final float speed, final int driftTime, final float startXPosition, final int startSize, final float[] xPositions) {
    float xMoved = 0;
    for (int i = startSize; i < (startSize + driftTime); i++) {
        xMoved += MarioAI.marioMovement.MarioControls.getNextDriftingDistance(speed, i);
        xPositions[i] = startXPosition + xMoved;
    }
}