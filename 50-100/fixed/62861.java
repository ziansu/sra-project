@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mSharedPrefs) != null) {
        boolean calendarSync = mSharedPrefs.getBoolean("calendarSync", false);
        startAlarmButton.setEnabled((!calendarSync));
    }
    updateColor(mHourSeekBar.getProgress());
    mHourHand.setRotation(((hourRotation) + ((mHourSeekBar.getProgress()) * 15)));
    mMinuteHand.setRotation(((minRotation) + ((mMinuteSeekBar.getProgress()) * 6)));
}