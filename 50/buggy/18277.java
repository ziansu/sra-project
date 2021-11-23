@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    userPreferences.setSleepTime(hourOfDay, minute);
    if (!(mSleepWakeEnable.isChecked())) {
    }
    mSleepTimeLabel.setText(formatTime(hourOfDay, minute));
}