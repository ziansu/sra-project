public void write(org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage message) throws java.io.IOException, org.eclipse.paho.client.mqttv3.MqttException {
    byte[] bytes = message.getHeader();
    byte[] pl = message.getPayload();
    out.write(message.getHeader());
    out.write(message.getPayload());
}