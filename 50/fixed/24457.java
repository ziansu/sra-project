private void onUploadProgress(org.wordpress.android.fluxc.model.MediaModel media, float progress) {
    java.lang.String localMediaId = java.lang.String.valueOf(media.getId());
    if ((mEditorMediaUploadListener) != null) {
        mEditorMediaUploadListener.onMediaUploadProgress(localMediaId, progress);
    }
}