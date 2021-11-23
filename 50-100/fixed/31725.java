private static void publishMqttMessage(java.lang.String topic, java.lang.String message) {
    if ((topic != null) && (message != null)) {
        try {
            com.microrisc.opengateway.apps.automation.OpenGatewayAppLp.mqttCommunicator.publish(topic, 2, message.getBytes());
        } catch (org.eclipse.paho.client.mqttv3.MqttException ex) {
            java.lang.System.err.println(("Error while publishing mqtt message: " + (ex.getMessage())));
        }
    }else {
        java.lang.System.err.println("Error while publishing mqtt message: topic or message is null");
    }
}