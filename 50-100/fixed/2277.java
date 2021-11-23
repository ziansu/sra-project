public void start() throws java.io.IOException, org.eclipse.paho.client.mqttv3.MqttException {
    try {
        socket = factory.createSocket(host, port);
    } catch (java.net.ConnectException ex) {
        trace.trace(Trace.FINE, 250, null, ex);
        throw org.eclipse.paho.client.mqttv3.internal.ExceptionHelper.createMqttException(MqttException.REASON_CODE_SERVER_CONNECT_ERROR);
    }
}