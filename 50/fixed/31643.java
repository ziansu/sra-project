private void sendEvent(java.lang.String eventName, @android.support.annotation.Nullable
com.facebook.react.bridge.WritableMap params) {
    this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit(eventName, params);
}