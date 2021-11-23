public void initialize(com.wdullaer.materialdatetimepicker.time.TimeIntervalPickerDialog.OnTimeSetListener callback, int hourOfDay, int minute, int second, boolean is24HourMode, int interval) {
    mCallback = callback;
    this.interval = interval;
    mInitialTime = new com.wdullaer.materialdatetimepicker.time.Timepoint(hourOfDay, roundUpToInterval(minute), second);
    mIs24HourMode = is24HourMode;
    mInKbMode = false;
    mTitle = "";
    mThemeDark = false;
    mThemeDarkChanged = false;
    mAccentColor = -1;
    mVibrate = true;
    mDismissOnPause = false;
    mEnableSeconds = false;
    mOkResid = R.string.mdtp_ok;
    mCancelResid = R.string.mdtp_cancel;
}