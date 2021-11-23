private void addCallback(java.lang.String topic, io.relayr.websocket.WebSocketCallback callback) {
    final java.util.List<io.relayr.websocket.WebSocketCallback> callbacks = mTopicCallbacks.get(topic);
    if (callbacks == null)
        mTopicCallbacks.put(topic, java.util.Arrays.asList(callback));
    else
        callbacks.add(callback);
    
}