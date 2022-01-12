private void fail() {
    if ((_callbackContext) != null) {
        _callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.ERROR));
        _callbackContext.error("Error");
    }
}