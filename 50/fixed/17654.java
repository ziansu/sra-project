@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    com.abhijitvalluri.android.fitnotifications.TimePickerFragment dialog = com.abhijitvalluri.android.fitnotifications.TimePickerFragment.newInstance(mStartTimeHour, mStartTimeMinute, mStopTimeHour, mStopTimeMinute, com.abhijitvalluri.android.fitnotifications.AppSettingsActivity.START_TIME_REQUEST);
    dialog.show(manager, com.abhijitvalluri.android.fitnotifications.AppSettingsActivity.DIALOG_TIME);
}