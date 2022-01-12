void unregister(com.jsoft.iot.mqttloadapp.runtime.RunningLoadConfiguration aThis, java.lang.String controlTopic) {
    try {
        listeners.remove(controlTopic);
        matchers.remove(controlTopic);
        client.unsubscribe(controlTopic);
        com.jsoft.iot.mqttloadapp.runtime.MqttConnection.LOG.info(("Unsubscribed from control topic " + controlTopic));
    } catch (org.eclipse.paho.client.mqttv3.MqttException ex) {
        com.jsoft.iot.mqttloadapp.runtime.MqttConnection.LOG.log(java.util.logging.Level.SEVERE, "could not unsubscribe", ex);
    }
}