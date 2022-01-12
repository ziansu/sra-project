private void showDocumentFromAssets(@android.support.annotation.NonNull
final java.lang.String assetPath, @android.support.annotation.Nullable
final java.lang.String password, @android.support.annotation.NonNull
final com.pspdfkit.configuration.activity.PdfActivityConfiguration configuration, @android.support.annotation.NonNull
final org.apache.cordova.CallbackContext callbackContext) {
    com.pspdfkit.cordova.ExtractAssetTask.extract(assetPath, cordova.getActivity(), new com.pspdfkit.cordova.ExtractAssetTask.OnDocumentExtractedCallback() {
        @java.lang.Override
        public void onDocumentExtracted(java.io.File documentFile) {
            if (documentFile != null) {
                showDocumentForUri(android.net.Uri.fromFile(documentFile), password, configuration);
                callbackContext.success();
            }else {
                callbackContext.error((("Could not load '" + assetPath) + "' from the assets."));
            }
        }
    });
}