private void anyDeviceConnect(org.apache.cordova.CallbackContext callbackContext) {
    if ((deviceType) == (IHEALTH_BP5)) {
        android.util.Log.i(TAG, "anyDeviceConnect for BP5");
        this.deviceConnectForBP5(callbackContext);
    }else
        if ((deviceType) == (IHEALTH_BP7)) {
            android.util.Log.i(TAG, "anyDeviceConnect for BP7");
            this.deviceConnectForBP7(callbackContext);
        }else {
            resetPluginState();
            callbackContext.error("Unknown Device");
        }
    
}