public void run() {
    android.util.Log.d(TAG, "GET LIVE STEPS CALLED");
    miBand.enableRealtimeStepsNotify(new de.max.miband.ActionCallback() {
        @java.lang.Override
        public void onSuccess(java.lang.Object data) {
            sendResult(callbackContext, "Enable Realtime Steps succeeded", true);
        }

        @java.lang.Override
        public void onFail(int errorCode, java.lang.String msg) {
            sendResult(callbackContext, "Enable Realtime Steps failed", false);
        }
    });
}