@java.lang.Override
protected void onPause() {
    super.onPause();
    if (mActive) {
        int time = getCurrentTime();
        mPreferences.savePauseTime(time);
        int timerTime = (((mHoursTime) * 3600) + ((mMinutesTime) * 60)) + (mSecondsTime);
        mPreferences.saveTimerTime(timerTime);
    }else {
        mPreferences.savePauseTime(0);
    }
}