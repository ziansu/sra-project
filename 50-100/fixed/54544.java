public void setCurrentTime(int time) {
    if ((time >= 0) && (time <= 3600)) {
        mCurrentTime = time;
        if ((mCircleTimerListener) != null) {
            mCircleTimerListener.onTimerSetValueChanged(time);
        }
        this.mCurrentRadian = ((float) (2 * (java.lang.Math.PI)));
        invalidate();
    }
}