@java.lang.Override
protected void onDialogClosed(boolean positiveResult) {
    super.onDialogClosed(positiveResult);
    if (positiveResult) {
        mLastHour = mTimePicker.getCurrentHour();
        mLastMinute = mTimePicker.getCurrentMinute();
        java.lang.String time = ((mLastHour) + ":") + (toTimeDigits(mLastMinute));
        if (callChangeListener(time)) {
            persistString(time);
        }
    }
}