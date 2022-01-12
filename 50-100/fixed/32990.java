@java.lang.Override
public void stop() {
    android.util.Log.d(org.eclipse.paho.android.service.AlarmPingSender.TAG, ("Unregister alarmreceiver to MqttService" + (comms.getClient().getClientId())));
    if (hasStarted) {
        hasStarted = false;
        if ((pendingIntent) != null) {
            android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (service.getSystemService(Service.ALARM_SERVICE)));
            alarmManager.cancel(pendingIntent);
        }
        try {
            service.unregisterReceiver(alarmReceiver);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }
}