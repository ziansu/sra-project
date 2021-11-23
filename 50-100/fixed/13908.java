private void onConnectCallback(java.lang.String profileName, java.lang.String clientId, boolean success) {
    if (success) {
        persistState(profileName, true);
        java.util.Iterator<org.eclipse.paho.android.service.MqttSubscriptionRecord> iter = org.eclipse.paho.android.service.MqttSubscriptionRecord.findAll(org.eclipse.paho.android.service.MqttSubscriptionRecord.class);
        while (iter.hasNext()) {
            org.eclipse.paho.android.service.MqttSubscriptionRecord record = iter.next();
            org.eclipse.paho.client.mqttv3.IMqttMessageListener messageListener = new org.eclipse.paho.android.service.tasker.TaskerMqttService.MqttMessageListener(this, record.topic, profileName);
            subscribe(clientId, record.topic, record.qos, profileName, null, messageListener);
        } 
    }
    persistState(profileName, false);
}