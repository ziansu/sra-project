@java.lang.Override
public void subscribedToChannel(java.lang.String subscription) {
    java.lang.String msg = java.lang.String.format("Subscribed to channel %s.", subscription);
    android.util.Log.i(com.monmouth.fayePG.FayeService.LOG_TAG, msg);
    if ((fayePG.getSubscribeCallbackContext()) != null) {
        org.apache.cordova.PluginResult result = new org.apache.cordova.PluginResult(PluginResult.Status.OK, msg);
        result.setKeepCallback(false);
        fayePG.getSubscribeCallbackContext().sendPluginResult(result);
    }
}