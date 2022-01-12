@java.lang.Override
public void run() {
    org.eclipse.paho.client.mqttv3.MqttMessage msg = new org.eclipse.paho.client.mqttv3.MqttMessage(application.getData().getBytes());
    msg.setRetained(true);
    msg.setQos(1);
    try {
        mqttClient.publish(topic, msg);
    } catch (org.eclipse.paho.client.mqttv3.MqttException me) {
        me.printStackTrace();
    }
}