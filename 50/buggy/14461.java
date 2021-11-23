@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    statusView.setBattery(intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0), intent.getIntExtra(BatteryManager.EXTRA_SCALE, 0), intent.getIntExtra(BatteryManager.EXTRA_STATUS, (-1)));
}