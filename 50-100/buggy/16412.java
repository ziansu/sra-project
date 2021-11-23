private void setVar(java.lang.String variable, java.lang.String value, org.apache.cordova.CallbackContext callbackContext) {
    if (!(trackerStarted)) {
        callbackContext.error("Tracker not started");
        return ;
    }
    java.lang.String result = tracker.set(variable, value);
    callbackContext.success(((("Set variable " + variable) + "to ") + value));
}