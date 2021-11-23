@com.facebook.react.bridge.ReactMethod
public void exists(java.lang.String id, com.facebook.react.bridge.Promise promise) {
    if ((Build.VERSION.SDK_INT) < 25)
        return ;
    
    if (isShortcutExist(id)) {
        promise.resolve(null);
    }else {
        promise.reject(SHORTCUT_NOT_EXIST, "Not found this app shortcut");
    }
}