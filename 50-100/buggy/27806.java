private void updateAlarm() {
    synchronized(this) {
        com.example.administrator.alarm.AlarmStorage.saveState(this, mToggleBtn.isEnabled());
        com.example.administrator.alarm.AlarmStorage.saveAllSetting(this, start_hourOfDay, start_min, stop_hourOfDay, stop_min, (mCheckBtn.isChecked() ? 1 : 0));
        com.example.administrator.alarm.AlarmControl.cancelAlarm(this);
        if (mToggleBtn.isChecked()) {
            com.example.administrator.alarm.AlarmControl.updateAlarm(this);
        }
    }
}