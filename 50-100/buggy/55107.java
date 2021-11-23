private void getDeviceDetailsJS(org.apache.cordova.CallbackContext callbackContext) {
    org.apache.cordova.PluginResult result = new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, "device not found");
    if ((usbDevice) != null) {
        java.lang.String json = "";
        json = ("{\"DeviceID\":\"" + (usbDevice.getDeviceId())) + "\",";
        json += ("\"VendorID\":\"" + (usbdDevice.getVendorId())) + "\",";
        json += ("\"ProductID\":\"" + (usbDevice.getProductId())) + "\"}";
        result = new org.apache.cordova.PluginResult(PluginResult.Status.OK, json);
    }
    callbackContext.sendPluginResult(result);
}