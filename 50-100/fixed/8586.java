public void write(org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage message) throws java.io.IOException, org.eclipse.paho.client.mqttv3.MqttException {
    byte[] bytes = message.getHeader();
    byte[] pl = message.getPayload();
    out.write(bytes, 0, bytes.length);
    out.write(pl, 0, pl.length);
}