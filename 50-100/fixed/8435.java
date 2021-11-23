@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.i("FRIDGELOG", "Broadcast has been received!");
    java.lang.String action = intent.getAction();
    if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
        android.util.Log.i("FRIDGELOG", "Broadcast was caught by ACTION_BOOT");
        setUpAlarmManager(context);
    }else {
        android.util.Log.i("FRIDGELOG", "Broadcast is creating notifications");
        showNotifications(context);
    }
}