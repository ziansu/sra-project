@java.lang.Override
public void start() {
    java.lang.String action = (MqttServiceConstants.PING_SENDER) + (comms.getClient().getClientId());
    android.util.Log.d(org.eclipse.paho.android.service.AlarmPingSender.TAG, ("Register alarmreceiver to MqttService" + action));
    service.registerReceiver(alarmReceiver, new android.content.IntentFilter(action));
    pendingIntent = android.app.PendingIntent.getBroadcast(service, 0, new android.content.Intent(action), PendingIntent.FLAG_UPDATE_CURRENT);
    schedule(comms.getKeepAlive());
    hasStarted = true;
}