private void disableKDC() {
    _kdcReader.EnableNFCPower(0);
    org.json.JSONObject parameter = new org.json.JSONObject();
    parameter.put("KDCDisable", _kdcReader.IsNFCPowerEnabled().toString());
    org.apache.cordova.PluginResult pluginResult = new org.apache.cordova.PluginResult(PluginResult.Status.OK, parameter);
    pluginResult.setKeepCallback(true);
    connectionCallbackContext.sendPluginResult(pluginResult);
}