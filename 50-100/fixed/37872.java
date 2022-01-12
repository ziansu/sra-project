@java.lang.Override
public boolean execute(java.lang.String action, java.lang.String rawArgs, org.apache.cordova.CallbackContext callback) throws org.json.JSONException {
    this.callback = callback;
    this.action = action;
    this.rawArgs = rawArgs;
    if (!(org.apache.cordova.PermissionHelper.hasPermission(this, de.martinreinhardt.cordova.plugins.hotspot.HotSpotPlugin.ACCESS_FINE_LOCATION))) {
        org.apache.cordova.PermissionHelper.requestPermission(this, action.hashCode(), de.martinreinhardt.cordova.plugins.hotspot.HotSpotPlugin.ACCESS_FINE_LOCATION);
    }else {
        return executeInternal(action, rawArgs, callback);
    }
    return false;
}