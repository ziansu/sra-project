private void invoke(final org.apache.cordova.CallbackContext callbackContext, java.lang.String mode) {
    com.instabug.library.IBGInvocationMode iMode = com.wodify.cordova.plugin.instabug.IBPlugin.parseInvocationMode(mode);
    try {
        if (iMode != null) {
            com.instabug.library.Instabug.invoke(iMode);
        }else {
            com.instabug.library.Instabug.invoke();
        }
    } catch (java.lang.IllegalStateException e) {
        callbackContext.error(errorMsg);
    }
}