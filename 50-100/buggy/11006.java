@java.lang.Override
public void onError(java.lang.String message, java.lang.String code, java.lang.Exception e) {
    com.facebook.react.bridge.WritableMap params = com.facebook.react.bridge.Arguments.createMap();
    params.putString("eventName", "connectionStateChange");
    params.putString("message", message);
    params.putString("code", code);
    params.putString("exceptionMessage", e.getMessage());
    sendEvent(params);
}