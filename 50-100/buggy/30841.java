public void onRequestPermissionResult(int requestCode, java.lang.String[] permissions, int[] grantResults) throws org.json.JSONException {
    for (int r : grantResults) {
        if (r == (android.content.pm.PackageManager.PERMISSION_DENIED)) {
            this.callback.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, de.martinreinhardt.cordova.plugins.hotspot.HotSpotPlugin.PERMISSION_DENIED_ERROR));
            return ;
        }
    }
    if (!(executeInternal(this.action, this.rawArgs, callback))) {
        this.callback.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, de.martinreinhardt.cordova.plugins.hotspot.HotSpotPlugin.PERMISSION_GENERAL_ERROR));
    }
}