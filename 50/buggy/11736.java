@com.facebook.react.bridge.ReactMethod
@javax.annotation.Nullable
public java.lang.Object variationForKey(@android.support.annotation.NonNull
java.lang.String key, @javax.annotation.Nullable
com.facebook.react.bridge.Callback callback) {
    java.lang.Object obj;
    obj = com.vwo.mobile.VWO.getVariationForKey(key);
    if (callback != null) {
        callback.invoke(obj);
    }
    return obj;
}