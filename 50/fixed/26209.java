public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    alarmList.get((position - 1)).setState(isChecked);
}