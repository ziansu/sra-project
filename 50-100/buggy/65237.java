public void setShowHintLine(boolean show) {
    showHintLine = show;
    android.util.Log.v(com.nulldreams.widget.AmplitudeBezierView.TAG, ((((("setShowHintLine isAttachedWithRecorder=" + (isAttachedWithRecorder())) + " isPlayStarted=") + (isPlayStarted())) + " isPlayPaused=") + (isPlayPaused())));
    if ((((!(isAttachedWithRecorder())) && (isPlayStarted())) && (!(isPlayPaused()))) && show) {
        mPaint.setColor(mHintLineColor);
        invalidate();
    }
}