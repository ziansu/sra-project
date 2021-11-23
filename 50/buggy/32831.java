public void run() {
    executeStop(data);
    callbackContext.sendPluginResult(executeUnload(data));
}