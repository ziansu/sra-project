@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    userPreferences.setSleepTime(hourOfDay, minute);
    mSleepTimeLabel.setText(formatTime(hourOfDay, minute));
}