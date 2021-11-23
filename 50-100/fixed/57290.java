private void addCallback(java.lang.String topic, io.relayr.websocket.WebSocketCallback callback) {
    if ((mTopicCallbacks.get(topic)) == null)
        mTopicCallbacks.put(topic, new java.util.ArrayList(java.util.Arrays.asList(callback)));
    else
        mTopicCallbacks.get(topic).add(callback);
    
}