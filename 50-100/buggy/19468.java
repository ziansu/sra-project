@java.lang.Override
protected void onImageCaptured(java.lang.String data) {
    super.onImageFileSaved(data);
    com.facebook.react.bridge.WritableMap event = com.facebook.react.bridge.Arguments.createMap();
    event.putString("message", ("data:image/jpeg;base64," + data));
    event.putString("type", "camera_capture");
    com.facebook.react.bridge.ReactContext reactContext = ((com.facebook.react.bridge.ReactContext) (getContext()));
    reactContext.getJSModule(com.facebook.react.uimanager.events.RCTEventEmitter.class).receiveEvent(getId(), "topChange", event);
    stopCamera();
    startCamera();
}