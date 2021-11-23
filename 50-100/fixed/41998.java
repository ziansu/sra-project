@java.lang.Override
public void transactionFailed(com.getcardflight.models.CardFlightError error) {
    android.util.Log.e(com.odd.cardflight.CDVCardFlight.TAG, ("error: " + (error.getMessage())));
    com.odd.cardflight.PluginResult pluginResult = new com.odd.cardflight.PluginResult(PluginResult.Status.ERROR, error.getMessage());
    pluginResult.setKeepCallback(true);
    onTransactionResultCallbackId.sendPluginResult(pluginResult);
}