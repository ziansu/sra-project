@java.lang.Override
public void onError(java.lang.Exception error) {
    try {
        com.facebook.react.bridge.WritableMap result = com.facebook.react.bridge.Arguments.createMap();
        if (error == null) {
            result.putString("error", "");
        }else {
            result.putString("error", error.toString());
        }
        failureCallback.invoke(result);
    } catch (org.json.JSONException exception) {
        com.facebook.react.bridge.WritableMap result = com.facebook.react.bridge.Arguments.createMap();
        result.putString("error", e.toString());
        failureCallback.invoke(result);
    }
}