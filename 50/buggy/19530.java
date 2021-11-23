private void sendEvent(com.facebook.react.bridge.ReactContext reactContext, java.lang.String eventName, com.umeng.message.entity.UMessage msg) {
    sendEvent(reactContext, eventName, convertToWriteMap(msg));
}