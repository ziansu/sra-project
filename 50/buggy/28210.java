@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    ((cs121.hmc.edu.remindme.AlarmListActivity) (mContext)).setAlarmEnabled(((java.lang.Long) (buttonView.getTag())), isChecked);
    dbHelper.updateAlarm(model);
}