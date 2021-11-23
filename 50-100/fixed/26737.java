@java.lang.Override
public void onSuccess(io.hypertrack.lib.transmitter.model.HTShift htShift) {
    try {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String shiftJson = gson.toJson(htShift);
        com.facebook.react.bridge.WritableMap result = com.facebook.react.bridge.Arguments.createMap();
        result.putString("trip", shiftJson);
        successCallback.invoke(result);
    } catch (java.lang.Exception e) {
        com.facebook.react.bridge.WritableMap result = com.facebook.react.bridge.Arguments.createMap();
        result.putString("error", e.toString());
        failureCallback.invoke(result);
    }
}