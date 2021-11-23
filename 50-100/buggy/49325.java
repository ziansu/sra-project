@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d("Wakeup", "hej AlarmBroadcastReceiver - onReceive");
    if ((com.fredrik.wakeup.AlarmBroadcastReceiver.wakeLock) == null) {
        android.os.PowerManager powerManager = ((android.os.PowerManager) (context.getSystemService(Context.POWER_SERVICE)));
        com.fredrik.wakeup.AlarmBroadcastReceiver.wakeLock = powerManager.newWakeLock(((android.os.PowerManager.PARTIAL_WAKE_LOCK) | (android.os.PowerManager.ACQUIRE_CAUSES_WAKEUP)), "MyWakelockTag");
        com.fredrik.wakeup.AlarmBroadcastReceiver.wakeLock.acquire();
    }
    android.content.Intent intent1 = new android.content.Intent(context, com.fredrik.wakeup.TaskTimer.class);
    intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent1);
}