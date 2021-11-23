@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, cordova.android.speech.plugin.CallbackContext callbackContext) throws org.json.JSONException {
    this.callbackContext = callbackContext;
    if (action.equals("getSupportedLanguages")) {
        this.getSupportedLanguages();
        return true;
    }else
        if ("startRecognize".equals(action)) {
            startSpeechRecognitionActivity(args);
        }
    
    return false;
}