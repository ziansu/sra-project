@com.facebook.react.bridge.ReactMethod
public void get(java.lang.String key, java.lang.String bucketName, com.facebook.react.bridge.Callback callback) {
    android.content.SharedPreferences preferences = getBucket(bucketName);
    java.lang.Object value = preferences.getAll().get(key);
    if (value != null) {
        callback.invoke(value.toString());
    }else {
        callback.invoke(null);
    }
}