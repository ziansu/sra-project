private void enableKDC() {
    _kdcReader.EnableNFCPower(true);
    org.json.JSONObject parameter = new org.json.JSONObject();
    parameter.put("KDCEnable", _kdcReader.IsNFCPowerEnabled());
    org.apache.cordova.PluginResult pluginResult = new org.apache.cordova.PluginResult(PluginResult.Status.OK, parameter);
    pluginResult.setKeepCallback(true);
    connectionCallbackContext.sendPluginResult(pluginResult);
}