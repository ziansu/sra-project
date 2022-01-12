private void disableKDC() {
    _kdcReader.EnableNFCPower(false);
    org.json.JSONObject parameter = new org.json.JSONObject();
    parameter.put("KDCDisable", _kdcReader.IsNFCPowerEnabled());
    org.apache.cordova.PluginResult pluginResult = new org.apache.cordova.PluginResult(PluginResult.Status.OK, parameter);
    pluginResult.setKeepCallback(true);
    connectionCallbackContext.sendPluginResult(pluginResult);
}