public org.eclipse.paho.client.mqttv3.MqttMessage createMessage(java.lang.String payload, com.eliasbagley.rxmqtt.constants.QoS qos) {
    org.eclipse.paho.client.mqttv3.MqttMessage m = new org.eclipse.paho.client.mqttv3.MqttMessage("payload".getBytes());
    m.setQos(qos.getValue());
    return m;
}