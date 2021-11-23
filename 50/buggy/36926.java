public void trackWithProperties(java.lang.String event, com.facebook.react.bridge.ReadableMap properties) {
    mixpanel.track(event, this.readableMapToJson(properties));
    android.util.Log.d("mixpanel", "trackWithProperties");
}