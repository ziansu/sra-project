@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    float acc = event.accuracy;
    float lux = event.values[0];
    java.lang.System.out.println(((("acc ----> " + acc) + "  lux ----> ") + lux));
    android.os.PowerManager pm = ((android.os.PowerManager) (getSystemService(Context.POWER_SERVICE)));
    if (lux == 0) {
        java.lang.System.out.println(11111111);
        android.os.PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.PROXIMITY_SCREEN_OFF_WAKE_LOCK, "My Tag");
        wl.acquire();
    }
}