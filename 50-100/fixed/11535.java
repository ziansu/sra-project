@java.lang.Override
public void messageArrived(java.lang.String topic, org.eclipse.paho.client.mqttv3.MqttMessage message) {
    if (((mTopicCallbacks) == null) || (mTopicCallbacks.isEmpty()))
        return ;
    
    for (io.relayr.websocket.WebSocketCallback socketCallback : mTopicCallbacks.get(topic))
        socketCallback.successCallback(message);
    
}