private org.apache.cordova.PluginResult recognize(org.json.JSONArray data, final org.apache.cordova.CallbackContext callbackContext) {
    cordova.getThreadPool().execute(new java.lang.Runnable() {
        public void run() {
            de.dfki.iui.mmir.plugins.speech.nuance.NuanceSpeechPlugin.isStopped = false;
            de.dfki.iui.mmir.plugins.speech.nuance.NuanceSpeechPlugin.isFinal = false;
            de.dfki.iui.mmir.plugins.speech.nuance.NuanceSpeechPlugin.isCancelled = false;
            de.dfki.iui.mmir.plugins.speech.nuance.NuanceSpeechPlugin.isRecordingMoreThanOnce = false;
            recognizer = createRecognitionHandler(callbackContext);
            de.dfki.iui.mmir.plugins.speech.nuance.NuanceEngine.getInstance().recognize(recognizer, false);
        }
    });
    org.apache.cordova.PluginResult returnValue = new org.apache.cordova.PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT);
    returnValue.setKeepCallback(true);
    return returnValue;
}