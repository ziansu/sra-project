public void run() {
    try {
        connectMQTTClient();
        if (mqttClient.isConnected()) {
            logger.info("MQTT client connection reestablished!");
        }else {
            logger.warn("Unable to reconnect MQTT client.");
        }
    } catch (org.eclipse.paho.client.mqttv3.MqttException e) {
        logger.error((("Could not re-connect the MQTT client. Message: " + (e.getMessage())) + " Reason code: "), e.getReasonCode());
    } finally {
        org.eclipse.orion.internal.server.events.EventService.reconnectionLock.set(false);
    }
}