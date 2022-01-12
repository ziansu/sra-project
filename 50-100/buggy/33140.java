@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(org.eclipse.paho.android.service.CONNECTIVITY_SERVICE)));
    traceDebug(org.eclipse.paho.android.service.MqttService.TAG, "Reconnect since BroadcastReceiver.");
    if (cm.getBackgroundDataSetting()) {
        if (!(backgroundDataEnabled)) {
            backgroundDataEnabled = true;
            reconnect();
        }
    }else {
        backgroundDataEnabled = false;
        notifyClientsOffline();
    }
}