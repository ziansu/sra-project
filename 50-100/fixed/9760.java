@java.lang.Override
protected void onPause() {
    super.onPause();
    android.util.Log.d(com.example.administrator.alarm.MainActivity.TAG, "onPause E");
    com.example.administrator.alarm.AlarmStorage.saveState(this, mToggleBtn.isChecked());
    com.example.administrator.alarm.AlarmStorage.saveAllSetting(this, start_hourOfDay, start_min, stop_hourOfDay, stop_min, (mCheckBtn.isChecked() ? 1 : 0));
}