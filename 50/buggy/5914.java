public float computeCurrentRadius(long currentTime, long totalTime) {
    return (((float) (currentTime)) / (0.0F + totalTime)) * 360;
}