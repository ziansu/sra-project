@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    android.util.Log.d("HELP", "You clicked Save");
    java.lang.String userResponse = "";
    if (resultCode == (RESULT_OK)) {
        userResponse = data.getStringExtra("User Response");
    }
    if (userResponse.equals("Save")) {
        com.example.root.myalarmclock.Alarm mAlarm = com.example.root.myalarmclock.AlarmSettingsActivity.getAlarm();
        setUpAlarmToolbar(mAlarm);
    }
}