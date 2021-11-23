public void connectionLost(java.lang.Throwable cause) {
    log(new java.lang.StringBuilder("Connection to lost! ").append(cause).toString());
    com.facebook.react.bridge.WritableMap params = com.facebook.react.bridge.Arguments.createMap();
    params.putString("event", "closed");
    params.putString("message", "Connection to lost!");
    sendEvent(_reactContext, "mqtt_events", params);
}