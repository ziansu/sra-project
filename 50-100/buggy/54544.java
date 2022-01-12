public void setCurrentTime(int time) {
    if ((time >= 0) && (time <= 3600)) {
        mCurrentTime = time;
        if ((mCircleTimerListener) != null) {
            mCircleTimerListener.onTimerSetValueChanged(time);
        }
        this.mCurrentRadian = ((float) ((((3600 / 60.0F) * 2) * (java.lang.Math.PI)) / 60));
        invalidate();
    }
}