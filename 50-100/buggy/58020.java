@java.lang.Override
public void run() {
    android.util.Log.i(com.applozic.mobicomkit.api.ApplozicMqttService.TAG, "MQTT message calling ");
    if (com.applozic.mobicomkit.api.ApplozicMqttService.MESSAGE_RECEIVED.equals(mqttMessageResponse.getType())) {
        syncCallService.syncMessages();
    }
    if (com.applozic.mobicomkit.api.ApplozicMqttService.MESSAGE_DELIVERED.equals(mqttMessageResponse.getType())) {
        java.lang.String[] splitKeyString = mqttMessageResponse.getMessage().split(",");
        java.lang.String keyString = splitKeyString[0];
        java.lang.String userId = splitKeyString[1];
        syncCallService.updateDeliveryStatus(keyString);
    }
}