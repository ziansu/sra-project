private void startReconnectCycle() {
    java.lang.String methodName = "startReconnectCycle";
    org.eclipse.paho.client.mqttv3.MqttAsyncClient.log.fine(org.eclipse.paho.client.mqttv3.MqttAsyncClient.CLASS_NAME, methodName, "503", new java.lang.Object[]{ this.clientId , new java.lang.Long(org.eclipse.paho.client.mqttv3.MqttAsyncClient.reconnectDelay) });
    reconnectTimer = new java.util.Timer();
    reconnectTimer.schedule(new org.eclipse.paho.client.mqttv3.MqttAsyncClient.ReconnectTask(), org.eclipse.paho.client.mqttv3.MqttAsyncClient.reconnectDelay);
}