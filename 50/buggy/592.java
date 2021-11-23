@com.facebook.react.bridge.ReactMethod
public void getOrientation(com.facebook.react.bridge.Callback success) {
    com.facebook.react.bridge.WritableNativeMap data = getDataMap();
    android.util.Log.e("DeviceOrientation", data.toString());
    success.invoke(data);
}