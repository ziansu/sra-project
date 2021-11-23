@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    android.util.Log.d(org.kotemaru.android.taskkiller.receiver.MonitorReceiver.TAG, ("onReceive:" + action));
    if (org.kotemaru.android.taskkiller.receiver.MonitorReceiver.ACTION_MONITOR.equals(action)) {
        final org.kotemaru.android.taskkiller.MyApplication app = ((org.kotemaru.android.taskkiller.MyApplication) (context.getApplicationContext()));
        app.getProcessMonitor().refresh(context, true);
    }
}