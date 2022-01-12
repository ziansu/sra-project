private void invoke(final org.apache.cordova.CallbackContext callbackContext, java.lang.String mode) {
    com.instabug.library.IBGInvocationMode iMode = com.wodify.cordova.plugin.instabug.IBPlugin.parseInvocationMode(mode);
    try {
        com.instabug.library.Instabug instabug = Instabug;
        if (iMode != null) {
            instabug.invoke(iMode);
        }else {
            instabug.invoke();
        }
    } catch (java.lang.IllegalStateException e) {
        callbackContext.error(errorMsg);
    }
}