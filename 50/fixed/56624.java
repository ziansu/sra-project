private void success() {
    if ((_callbackContext) != null) {
        _callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.OK));
        _callbackContext.success();
    }
}