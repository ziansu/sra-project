@java.lang.Override
public void deliveryComplete(org.eclipse.paho.client.mqttv3.IMqttDeliveryToken imdt) {
    com.freedomotic.plugins.devices.mqttclient.Mqtt.LOG.info("Message published");
}