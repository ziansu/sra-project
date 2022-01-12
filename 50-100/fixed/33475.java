private boolean bindListener(final org.apache.cordova.CallbackContext callbackContext) {
    android.util.Log.i("xyz-plugin", "listener(callbackContext) starts");
    org.apache.cordova.CallbackContext listenerCallbackContext = new org.apache.cordova.CallbackContext();
    cordova.getThreadPool().execute(new java.lang.Runnable() {
        public void run() {
            try {
                listenerCallbackContext = callbackContext;
                com.gadgettronix.SystemAudio.SystemAudio.sendToJS();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    });
    return true;
}