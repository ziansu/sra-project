@java.lang.Override
public void onCreate() {
    super.onCreate();
    m_batteryHandler = new com.asksven.betterbatterystats.BatteryChangedHandler();
    this.registerReceiver(m_batteryHandler, new android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED));
}