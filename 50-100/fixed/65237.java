public void setShowHintLine(boolean show) {
    showHintLine = show;
    if ((((!(isAttachedWithRecorder())) && (!(isPlayStarted()))) && (!(isPlayPaused()))) && show) {
        mPaint.setColor(mHintLineColor);
        invalidate();
    }
}