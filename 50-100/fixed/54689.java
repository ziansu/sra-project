@java.lang.SuppressWarnings(value = "unchecked")
public void setServoValue(com.rabidllamastudios.avigate.models.ArduinoPacket.ServoType servoType, int value) {
    org.json.simple.JSONObject servoJson = new org.json.simple.JSONObject();
    if (rootJson.containsKey(servoType.getStringValue())) {
        servoJson = ((org.json.simple.JSONObject) (rootJson.get(servoType.getStringValue())));
    }
    servoJson.put(com.rabidllamastudios.avigate.models.ArduinoPacket.KEY_VALUE, ((long) (value)));
    rootJson.put(servoType.getStringValue(), servoJson);
}