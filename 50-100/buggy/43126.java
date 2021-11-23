private void initializeRenderer(java.lang.String filePath, org.apache.cordova.CallbackContext callbackContext) {
    android.util.Log.d(com.bjss.plugin.PdfRendererPlugin.LOG_TAG, "initializeRenderer");
    renderer = null;
    try {
        initializeWriteFileDescriptor(filePath, callbackContext);
        renderer = new android.graphics.pdf.PdfRenderer(fileDescriptor);
    } catch (java.io.IOException io) {
        java.lang.String msg = io.getMessage();
        if (msg == null)
            msg = "An error has occurred while loading the requested file.";
        
        android.util.Log.e(com.bjss.plugin.PdfRendererPlugin.LOG_TAG, msg);
        callbackContext.error(msg);
    }
}