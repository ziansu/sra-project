private void registerReadCallback(org.apache.cordova.CallbackContext callbackContext) {
    cordova.getThreadPool().execute(new java.lang.Runnable() {
        public void run() {
            readCallback = callbackContext;
            org.json.JSONObject returnObj = new org.json.JSONObject();
            org.apache.cordova.PluginResult pluginResult = new org.apache.cordova.PluginResult(PluginResult.Status.OK, returnObj);
            pluginResult.setKeepCallback(true);
            callbackContext.sendPluginResult(pluginResult);
        }
    });
}