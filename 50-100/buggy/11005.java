public static void sendEvent(final com.facebook.react.bridge.ReactContext context, final java.lang.String eventName, final com.facebook.react.bridge.WritableMap params) {
    if (context.hasActiveCatalystInstance()) {
        android.util.Log.d(io.fullstack.firestack.FirestackUtils.TAG, ("Sending event " + eventName));
        context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit(eventName, params);
    }else {
        android.util.Log.d(io.fullstack.firestack.FirestackUtils.TAG, "Waiting for CatalystInstance before sending event");
    }
}