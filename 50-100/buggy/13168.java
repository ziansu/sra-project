@com.facebook.react.bridge.ReactMethod
public void logout(final com.facebook.react.bridge.Callback callback) {
    com.facebook.react.bridge.WritableMap map = com.facebook.react.bridge.Arguments.createMap();
    mTokenCallback = callback;
    com.facebook.login.LoginManager.getInstance().logOut();
    map.putString("message", "Facebook Logout executed");
    map.putString("eventName", "onLogout");
    consumeCallback(mTokenCallback, CALLBACK_TYPE_SUCCESS, map);
}