private void anyDeviceConnect(org.apache.cordova.CallbackContext callbackContext) {
    switch (deviceType) {
        case IHEALTH_BP7 :
            android.util.Log.i(TAG, "anyDeviceConnect for BP7");
            this.deviceConnectForBP7(callbackContext);
            break;
        case IHEALTH_BP5 :
            android.util.Log.i(TAG, "anyDeviceConnect for BP5");
            this.deviceConnectForBP5(callbackContext);
            break;
        case UNKNOWN_DEVICE :
            android.util.Log.i(TAG, "anyDeviceConnect for UNKNOWN_DEVICE");
            resetPluginState();
            callbackContext.error("Unknown Device");
    }
}