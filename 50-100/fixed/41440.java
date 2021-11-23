private void updatePosition(float dx, int currentPos) {
    int totalTimeDuration = mMedia.getDuration();
    mSeekWhenPrepared = java.lang.Math.min((currentPos + ((int) ((dx * totalTimeDuration) / (getWidth())))), totalTimeDuration);
    showSeekTextView(mSeekWhenPrepared, totalTimeDuration);
}