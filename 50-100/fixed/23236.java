@com.facebook.react.bridge.ReactMethod
@javax.annotation.Nullable
public void variationForKey(@android.support.annotation.NonNull
java.lang.String key, @javax.annotation.Nullable
com.facebook.react.bridge.Callback callback) {
    java.lang.Object retrievedObject = com.vwo.mobile.VWO.getVariationForKey(key);
    if (callback != null) {
        if (retrievedObject == null) {
            callback.invoke(("No variation found for key: " + key));
        }else {
            callback.invoke(null, retrievedObject);
        }
    }
}