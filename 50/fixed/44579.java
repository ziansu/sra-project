public void sendFrame(org.fusesource.mqtt.codec.MQTTFrame frame) throws java.lang.Exception {
    checkConnected();
    sendBytes(wireFormat.marshal(frame));
}