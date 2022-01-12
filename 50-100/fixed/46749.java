@java.lang.Override
public void onDocumentExtracted(java.io.File documentFile) {
    if (documentFile != null) {
        showDocumentForUri(android.net.Uri.fromFile(documentFile), password, configuration);
        callbackContext.success();
    }else {
        callbackContext.error((("Could not load '" + assetPath) + "' from the assets."));
    }
}