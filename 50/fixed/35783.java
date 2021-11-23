public int getMaxConfidence() {
    int maxConfidence = 0;
    for (competition.subsystems.vision.BallSpatialTemporalInfo ball : currentBalls) {
        maxConfidence = java.lang.Math.max(maxConfidence, ball.getTemporalConfidence());
    }
    return maxConfidence;
}