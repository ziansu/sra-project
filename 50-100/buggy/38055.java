private void sendEvent(cn.jiguang.analytics.android.api.Event event, com.facebook.react.bridge.ReadableMap map) {
    cn.jpush.reactnativejanalytics.Logger.d("JAnalyticsModule", ("sending event: " + event));
    com.facebook.react.bridge.ReadableMap extra = map.getMap("extra");
    com.facebook.react.bridge.ReadableMapKeySetIterator iterator = extra.keySetIterator();
    while (iterator.hasNextKey()) {
        java.lang.String key = iterator.nextKey();
        event.addKeyValue(key, extra.getString(key));
    } 
    cn.jiguang.analytics.android.api.JAnalyticsInterface.onEvent(getReactApplicationContext(), event);
}