@java.lang.Override
public void disconnectedFromServer() {
    java.lang.String msg = "Disconnected from Server";
    android.util.Log.i(com.monmouth.fayePG.FayeService.LOG_TAG, msg);
    if ((fayePG.getDisconnectCallbackContext()) != null) {
        org.apache.cordova.PluginResult result = new org.apache.cordova.PluginResult(PluginResult.Status.OK, msg);
        result.setKeepCallback(false);
        fayePG.getDisconnectCallbackContext().sendPluginResult(result);
    }
}