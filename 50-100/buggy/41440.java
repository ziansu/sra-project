private void updatePosition(float dx, int currentPos) {
    int totalTimeDuration = mMedia.getDuration();
    mSeekWhenPrepared = java.lang.Math.min(((int) ((currentPos + (dx * totalTimeDuration)) / (getWidth()))), totalTimeDuration);
    showSeekTextView(mSeekWhenPrepared, totalTimeDuration);
}