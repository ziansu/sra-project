@java.lang.Override
public void messageArrived(java.lang.String topic, org.eclipse.paho.client.mqttv3.MqttMessage message) {
    if (((mTopicCallbacks) == null) || (mTopicCallbacks.isEmpty()))
        return ;
    
    final java.util.List<io.relayr.websocket.WebSocketCallback> callbacks = mTopicCallbacks.get(topic);
    for (io.relayr.websocket.WebSocketCallback socketCallback : callbacks)
        socketCallback.successCallback(message);
    
}