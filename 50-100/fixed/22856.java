@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (Constants.GENERATE_CLIENT_ID_COMMAND.equals(e.getActionCommand())) {
        clientId.setText(org.apache.jmeter.protocol.mqtt.utilities.Utils.UUIDGenerator());
    }else
        if (Constants.RESET_CREDENTIALS.equals(e.getActionCommand())) {
            mqttUser.setText(Constants.MQTT_USER_USERNAME);
            mqttPwd.setText(Constants.MQTT_USER_PASSWORD);
        }
    
}