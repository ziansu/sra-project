@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_alarm_edit);
    java.lang.String title;
    title = getString(R.string.editAlarmHeader);
    if ((getActionBar()) != null) {
        getActionBar().setTitle(title);
    }
    alarmTimePicker = ((android.widget.TimePicker) (findViewById(R.id.alarmTimePicker)));
    alarmManager = ((android.app.AlarmManager) (getSystemService(csuchico.smartnap.ALARM_SERVICE)));
    alarmNameText = ((android.widget.EditText) (findViewById(R.id.alarmNameEdit)));
}