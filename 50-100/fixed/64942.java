private void showSharedPreferences() {
    android.content.SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARE_PREFERENCES, com.example.framgia.alarmclock.ui.activity.MODE_PRIVATE);
    mEditor = sharedPreferences.edit();
    mCheckBoxAutoLaunch.setChecked(sharedPreferences.getBoolean(Constants.AUTO_LAUNCH, false));
    mCheckBoxShowBattery.setChecked(sharedPreferences.getBoolean(Constants.SHOW_BATTERY, true));
    mCheckBoxAutoSnooze.setChecked(sharedPreferences.getBoolean(Constants.AUTO_SNOOZE, true));
    mTypePicker = sharedPreferences.getInt(Constants.TYPE_PICKER, Constants.TYPE_ANALOG);
    mTextViewTypeClock.setText(com.example.framgia.alarmclock.ui.activity.AdvancedActivity.TYPE_CLOCKS[mTypePicker]);
}