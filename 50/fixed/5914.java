public float computeCurrentRadius(long currentTime, long totalTime) {
    if (totalTime > 0) {
        return (((float) (currentTime)) / (0.0F + totalTime)) * 360;
    }else {
        return 0;
    }
}