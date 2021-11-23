@com.facebook.react.bridge.ReactMethod
public void getPublishableKey(final com.facebook.react.bridge.Callback successCallback, final com.facebook.react.bridge.Callback errorCallback) {
    android.content.Context context = getReactApplicationContext();
    callback.invoke(com.hypertrack.lib.HyperTrack.getPublishableKey(context));
}