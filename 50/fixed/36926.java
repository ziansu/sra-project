@com.facebook.react.bridge.ReactMethod
public void trackWithProperties(java.lang.String event, com.facebook.react.bridge.ReadableMap properties) {
    mixpanel.track(event, this.readableMapToJson(properties));
}