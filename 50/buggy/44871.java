@java.lang.Override
protected void onResume() {
    super.onResume();
    if (d_isAlarmSetting) {
        SetAlarms();
        com.example.matsumotokazuya.mynidonealarm.LogUtil.LogString("Call SetAlarms");
    }
    SetStatSurface();
    ReadDataStore();
}