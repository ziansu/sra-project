public void setHintLineColor(int hintLineColor) {
    mHintLineColor = hintLineColor;
    if ((((!(isAttachedWithRecorder())) && (!(isPlayStarted()))) && (!(isPlayPaused()))) && (showHintLine)) {
        mPaint.setColor(mHintLineColor);
        invalidate();
    }
}