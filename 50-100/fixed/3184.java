@java.lang.Override
public void onError(com.facebook.FacebookException error) {
    android.util.Log.d(com.magus.fblogin.FacebookLoginModule.TAG, ("ShareApi.share: onError: error = " + (error.toString())));
    error.printStackTrace();
    if ((mLoginCallback) == null)
        return ;
    
    com.facebook.react.bridge.WritableMap map = com.facebook.react.bridge.Arguments.createMap();
    map.putString("message", error.getMessage());
    map.putString("eventName", "Share: onError");
    invokeCallback(mShareCallback, CALLBACK_TYPE_ERROR, map);
    mShareCallback = null;
}