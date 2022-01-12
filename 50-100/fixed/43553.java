public synchronized void makeCall(final java.lang.String number, final org.apache.cordova.CallbackContext callbackContext) {
    gr.navarino.cordova.plugin.PjsipActions.cordova.getThreadPool().execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            gr.navarino.cordova.plugin.PjsipActions.pjsipActivity.makeCall(number, callbackContext);
            callbackContext.success();
        }
    });
}