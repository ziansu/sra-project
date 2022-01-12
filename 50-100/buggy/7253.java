public void connectionLost(java.lang.Throwable cause) {
    log(("Connection to lost! " + cause));
    com.facebook.react.bridge.WritableMap params = com.facebook.react.bridge.Arguments.createMap();
    params.putString("event", "closed");
    params.putString("message", "Connection to lost!");
    sendEvent(_reactContext, "mqtt_events", params);
}