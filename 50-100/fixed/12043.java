@com.facebook.react.bridge.ReactMethod
public void hangUp() {
    java.util.Map<java.lang.String, java.lang.String> userInfo = new java.util.HashMap<>();
    userInfo.put("key", "value");
    com.sts.RNQuickblox.QuickbloxHandler.getInstance().getSession().hangUp(userInfo);
    com.sts.RNQuickblox.QuickbloxHandler.getInstance().setSession(null);
    com.sts.RNQuickblox.QuickbloxHandler.getInstance().release();
}