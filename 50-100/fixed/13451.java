public static void publishMessage(org.eclipse.paho.client.mqttv3.MqttClient mqttClient, java.lang.String message) {
    org.eclipse.paho.client.mqttv3.MqttMessage mqttMessage = new org.eclipse.paho.client.mqttv3.MqttMessage(message.getBytes());
    mqttMessage.setQos(iotplatform.androidapp.mqtt.MqttConnection.QOS);
    try {
        if (mqttClient != null) {
            mqttClient.publish(iotplatform.androidapp.mqtt.MqttConnection.TOPIC, mqttMessage);
            java.lang.System.out.println(("Publish message: " + mqttMessage));
        }
    } catch (org.eclipse.paho.client.mqttv3.MqttException e) {
        e.printStackTrace();
    }
}